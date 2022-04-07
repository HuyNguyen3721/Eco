package com.lam2000.base_module.share

import android.content.Context
import java.io.File

interface ShareFileDelegate {
    fun shareVideo(context: Context, file: File, title: String = "")
    fun shareImages(context: Context, file: File, title: String = "")
}