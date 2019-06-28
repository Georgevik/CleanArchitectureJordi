package com.georgevik.base.util

import java.net.URL


fun String.toURL(): URL? {
    return try {
        URL(this)
    } catch (e: Exception) {
        null
    }
}