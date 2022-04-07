package com.example.eco_test.broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.example.eco_test.R

class BroadCastActionMusic : BroadcastReceiver() {
    var listenerPlay: (() -> Unit)? = null
    var listenerPause: (() -> Unit)? = null
    var listenerBack: (() -> Unit)? = null
    var listenerNext: (() -> Unit)? = null
    var listenerClose: (() -> Unit)? = null
    override fun onReceive(context: Context?, intent: Intent?) {
        when (intent?.action ?: "") {
            context?.getString(R.string.action_play) -> {
                listenerPlay?.invoke()
            }
            context?.getString(R.string.action_pause) -> {
                listenerPause?.invoke()
            }
            context?.getString(R.string.action_back) -> {
                listenerBack?.invoke()
            }
            context?.getString(R.string.action_next) -> {
                listenerNext?.invoke()
            }
            context?.getString(R.string.action_close) -> {
                listenerClose?.invoke()
            }
        }
    }
}