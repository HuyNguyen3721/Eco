package com.lam2000.base_module.extensions

fun Boolean?.orFalse(): Boolean {
    return this ?: false
}