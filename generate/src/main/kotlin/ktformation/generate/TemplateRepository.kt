package ktformation.generate

class TemplateRepository {
    companion object {
        private val repository = mutableMapOf<String, Template>()

        fun load(path: String): Template = repository.getOrPut(path) {
            Template.load(TemplateRepository::class.java.classLoader.getResource(path))
        }
    }
}