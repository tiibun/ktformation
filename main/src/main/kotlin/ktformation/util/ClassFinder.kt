package ktformation.util

import java.io.File
import java.util.jar.JarFile

class ClassFinder {
    companion object {
        fun getChildren(parentClass: Class<*>): List<Class<*>> {
            return listClassPaths().map {
                when {
                    it.endsWith(".jar") -> listClasses(JarFile(it))
                    else -> listClasses(File(it))
                }
            }.flatten().mapNotNull {
                // Exclude which raises a fatal error in IntelliJ
                if (it.startsWith("com.sun.") || it.startsWith("sun.")) {
                    null
                } else {
                    try {
                        Class.forName(it)
                    } catch (e: Throwable) {
                        null
                    }
                }
            }.filter { parentClass.isAssignableFrom(it) }
        }

        fun listClassPaths(): List<String> {
            return System.getProperty("java.class.path").split(System.getProperty("path.separator"))
        }

        fun listClasses(path: File): List<String> {
            return path.walk().filter { it.name.endsWith(".class") }
                    .map { it.path.removePrefix(path.path + "/").removeSuffix(".class")
                            .replace('/', '.') }.toList()
        }

        fun listClasses(jar: JarFile): List<String> {
            return jar.entries().asSequence().filter { it.name.endsWith(".class") }
                    .map { it.name.removeSuffix(".class").replace('/', '.') }.toList()
        }
    }
}
