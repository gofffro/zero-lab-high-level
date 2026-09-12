fun main(args: Array<String>) {
    val counts = args.groupingBy { it }.eachCount()
    println(counts.keys.sorted().joinToString(" ") { "$it ${counts[it]}" })
}
