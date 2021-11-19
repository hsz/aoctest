package com.github.hsz.aoctest

/**
 * Maps a string containing integers in new lines to a list of integers.
 */
fun String.ints(): List<Int> = lines().map(String::toInt)

/**
 * Shorthand for [String.toInt].
 */
operator fun String.unaryPlus() = toInt()
