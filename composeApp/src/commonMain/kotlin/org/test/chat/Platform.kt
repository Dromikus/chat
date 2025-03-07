package org.test.chat

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform