fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {
    val groupsByLength = collection. groupBy {  it.length }

    val maximumSizeOfGroup = groupsByLength.values.map { group -> group.count() }.max()

    return groupsByLength.values.firstOrNull { group -> group.size == maximumSizeOfGroup }
}
