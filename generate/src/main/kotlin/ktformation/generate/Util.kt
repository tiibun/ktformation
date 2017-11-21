package ktformation.generate

import java.net.URL

enum class LogLevel {
    ERROR,
    INFO,
    DEBUG
}

fun log(level: LogLevel, message: String) {
    when (level) {
        LogLevel.ERROR -> System.err
        else -> System.out
    }.println("[$level] $message")
}

fun String.asResource(): URL = Thread.currentThread().contextClassLoader.getResource(this)
