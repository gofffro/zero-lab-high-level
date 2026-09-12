fun main(args: Array<String>) {
    val words: List<String> = if (args.isNotEmpty()) {
        args.toList()
    } else {
        val input = System.`in`.bufferedReader().readText().trim()
        if (input.isEmpty()) emptyList() else input.split(Regex("\\s+"))
    }

    val counts = words.groupingBy { it }.eachCount()
    println(
        counts.entries
            .sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy { it.key })
            .joinToString(" ") { "${it.key} ${it.value}" }
    )
}
