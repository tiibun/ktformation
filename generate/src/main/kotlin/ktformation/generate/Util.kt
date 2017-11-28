package ktformation.generate

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
