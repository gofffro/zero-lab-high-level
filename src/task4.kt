fun main(args: Array<String>) {
    val counts = args.groupingBy { it }.eachCount()
    counts.keys.sorted().forEach { println("$it ${counts[it]}") }
}
