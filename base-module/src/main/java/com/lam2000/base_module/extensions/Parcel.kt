package com.lam2000.base_module.extensions

import android.os.*

fun Parcel?.writeBool(value: Boolean) {
    val newValue = if (value) 1 else 0
    this?.writeInt(newValue)
}

fun Parcel?.readBool(): Boolean {
    return when (this?.readInt()) {
        1 -> true
        else -> false
    }
}