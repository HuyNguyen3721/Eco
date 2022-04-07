package com.lam2000.base_module.extensions

fun Double?.orZero(): Double {
    return this ?: 0.0
}