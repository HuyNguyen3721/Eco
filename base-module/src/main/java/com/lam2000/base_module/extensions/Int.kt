package com.lam2000.base_module.extensions

fun Int?.orZero(): Int {
    return this ?: 0
}