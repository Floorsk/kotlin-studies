fun main() {
    val email = """
        Hello %s
        How
        Are you
    """.trimIndent()

    println(email.format("Davi"))
}