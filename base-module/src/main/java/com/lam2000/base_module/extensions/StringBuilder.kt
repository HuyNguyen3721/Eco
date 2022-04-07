package com.lam2000.base_module.extensions

fun StringBuilder.appendIfNotNullOrBlank(prefix: String = "", value: String?, suffix: String = ""): StringBuilder {
    if (value.isNullOrBlank().not()) {
        append(prefix)
        append(value)
        append(suffix)
    }
    return this
}