fun main(args: Array<String>) {
    val counts = args.groupingBy { it }.eachCount()
    println(
        counts.entries
            .sortedWith(compareByDescending<Map.Entry<String, Int>> { it.value }.thenBy { it.key })
            .joinToString(" ") { "${it.key} ${it.value}" }
    )
}
