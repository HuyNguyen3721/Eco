package com.lam2000.base_module.extensions

import java.util.*

val Locale?.isRussian: Boolean
    get() = this?.language == "ru"