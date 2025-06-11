package dev.eastar.wlang

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform