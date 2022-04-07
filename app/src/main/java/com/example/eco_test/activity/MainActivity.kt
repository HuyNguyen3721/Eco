package com.example.eco_test.activity

import android.Manifest
import android.content.ComponentName
import android.content.Context
import android.content.Intent
import android.content.ServiceConnection
import android.media.AudioManager
import android.os.Build
import android.os.Bundle
import android.os.IBinder
import android.view.LayoutInflater
import androidx.core.view.isVisible
import com.example.eco_test.R
import com.example.eco_test.adapter.AdapterSong
import com.example.eco_test.databinding.ActivityMainBinding
import com.example.eco_test.model.ItemSong
import com.example.eco_test.service.MusicService
import com.example.eco_test.utils.KeyActiveMusic
import com.example.eco_test.utils.RecycleViewUtils
import com.example.eco_test.viewmodel.SongViewModel
import com.lam2000.base_module.activity.BaseActivity
import com.lam2000.base_module.utils.PreferencesUtils
import org.koin.android.ext.android.inject

class MainActivity : BaseActivity<ActivityMainBinding>() {
    private var audioManager: AudioManager? = null
    private var conection: ServiceConnection? = null
    var service: MusicService? = null

    //
    private var listSong = mutableListOf<ItemSong>()
    private val songViewModel by inject<SongViewModel>()
    private var adapterSong: AdapterSong? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        requestPermission(
            {
                if (!it) {
                    finishAffinity()
                } else {
                    connection()
                    if (!MusicService.isRunning) {
                        openServiceUnBound()
                    }
                }
            },
            Manifest.permission.WRITE_EXTERNAL_STORAGE
        )
        super.onCreate(savedInstanceState)
    }

    override fun initView() {
        //rcl
        adapterSong = AdapterSong(this, listSong)
        binding.rclSong.adapter = adapterSong
        //remove anim rcl
        RecycleViewUtils.clearAnimation(binding.rclSong)
    }

    override fun initData() {
        val path = PreferencesUtils.getString(KeyActiveMusic.KEY_PATH_MUSIC, null)
        listSong.clear()
        songViewModel.songLiveData.observe(this) {
            it?.let {
                if (path == it.path) {
                    binding.layoutControlMusic.isVisible = true
                    binding.icPlay.setImageResource(
                        if(service?.mediaPlayer?.isPlaying ==true)
                            R.drawable.ic_pause_music else
                                R.drawable.ic_play_music)
                    it.isSelected = true
                    binding.nameMusic.text = it.songName
                    binding.nameAuthor.text = it.singer
                } else {
//                    binding.layoutControlMusic.isVisible = false
                }
                listSong.add(it)
                adapterSong?.notifyItemInserted(listSong.size - 1)
            }
        }
        // view model
        // next
        songViewModel.actionNext.observe(this) {
            if (it) {
                for (i in 0 until listSong.size) {
                    if (listSong[i].isSelected) {
                        if (i + 1 < listSong.size) {
                            selectedMusic(i + 1)
                        } else {
                            selectedMusic(0)
                        }
                        break
                    }
                }
            }
        }
        // back
        songViewModel.actionBack.observe(this) {
            if (it) {
                for (i in 0 until listSong.size) {
                    if (listSong[i].isSelected) {
                        if (i - 1 < 0) {
                            selectedMusic(listSong.size - 1)
                        } else {
                            selectedMusic(i - 1)
                        }
                        break
                    }
                }
            }
        }
        //
        songViewModel.isMusicActive.observe(this) {
            setUpViewPlayOrPause(it)
        }
        songViewModel.nameMusicSong.observe(this) { name ->
            binding.nameMusic.text = name
        }
        songViewModel.nameAuthorSong.observe(this) {
            binding.nameAuthor.text = it
        }
    }

    override fun initListener() {
        //
        adapterSong?.onClickItem = {
            selectedMusic(it)
        }
        //play
        binding.icPlay.setOnClickListener {
            service?.let {
                if (it.mediaPlayer == null) {
                    val path = PreferencesUtils.getString(KeyActiveMusic.KEY_PATH_MUSIC, null)
                    it.onPlayMusic(path)
                } else {
                    if (it.mediaPlayer?.isPlaying == true) {
                        it.onPauseMusic()
                    } else {
                        it.onPlayMusic(null)
                    }
                }
            }
        }
        //next
        binding.icNext.setOnClickListener {
            songViewModel.actionNext.value = (true)
        }
        //back
        binding.icBack.setOnClickListener {
            songViewModel.actionBack.value = (true)
        }

    }

    override fun viewBinding(): ActivityMainBinding {
        return ActivityMainBinding.inflate(LayoutInflater.from(this))
    }

    private fun connection() {
        val intent = Intent(this, MusicService::class.java)
        conection = object : ServiceConnection {
            override fun onServiceConnected(name: ComponentName?, serviceBinder: IBinder?) {
                val binder = serviceBinder as MusicService.MyBinder
                service = binder.service
                songViewModel.getDataMusicOffline(this@MainActivity)
            }

            override fun onServiceDisconnected(name: ComponentName?) {
            }
        }// gửi yêu càu kết nối
        this.bindService(intent, conection!!, Context.BIND_AUTO_CREATE)
    }

    private fun openServiceUnBound() {
        val intent = Intent()
        intent.setClass(this, MusicService::class.java)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            this.startForegroundService(intent)
        } else {
            this.startService(intent)
        }
    }

    private fun selectedMusic(position: Int) {
        if (position >= 0) {
            binding.layoutControlMusic.isVisible = true
            val data = listSong[position]
            // rename control music
            songViewModel.nameMusicSong.value = (data.songName)
            songViewModel.nameAuthorSong.value = (data.singer)
            songViewModel.imgSong.value = (data.resId)
            //
            data.path?.let { path ->
                PreferencesUtils.putString(KeyActiveMusic.KEY_PATH_MUSIC, path)
                service?.onPlayMusic(path) { complete ->
                    if (complete) {
                        for (item in listSong) {
                            if (item == data) {
                                item.isSelected = true
                                adapterSong?.notifyItemChanged(position)
                            } else {
                                if (item.isSelected) {
                                    item.isSelected = false
                                    adapterSong?.notifyItemChanged(listSong.indexOf(item))
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private fun setUpViewPlayOrPause(isMusicActive: Boolean) {
        if (isMusicActive) {
            binding.icPlay.setImageResource(R.drawable.ic_pause_music)
        } else {
            binding.icPlay.setImageResource(R.drawable.ic_play_music)
        }
    }

    override fun onPause() {
        songViewModel.isActiveMain.value = false
        super.onPause()
    }

    override fun onResume() {
        songViewModel.isActiveMain.value = true
        super.onResume()
    }
}