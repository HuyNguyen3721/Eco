package com.lam2000.base_module.extensions

import java.text.NumberFormat
import java.util.*

fun Long.convertToPrice(): String {
    val format = NumberFormat.getNumberInstance()
    format.maximumFractionDigits = 0
    return format.format(this)
}

fun String.toCurrencySymbol(): String {
    val currency = Currency.getInstance(this)
    return currency.symbol
}