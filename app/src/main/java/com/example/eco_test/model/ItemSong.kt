package com.example.eco_test.model

import android.graphics.Bitmap

data class ItemSong(
    var resId: Bitmap?,
    var songName: String?,
    var singer: String?,
    var path: String?,
    var isSelected: Boolean = false
)
