package com.georgevik.base.util

inline fun <T : Any, R> ifLet(vararg elements: T?, closure: (List<T>) -> R): R? {
    return if (elements.all { it != null }) {
        closure(elements.filterNotNull())
    } else null
}