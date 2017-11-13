class DateRange(val start: MyDate, val end: MyDate) {
    operator fun iterator() = MyDateIterator(this)
}

class MyDateIterator(val dateRange: DateRange) : Iterator<MyDate> {
    var current = dateRange.start

    override fun hasNext() = current <= dateRange.end

    override fun next(): MyDate {
        val result = current
        current = current.nextDay()
        return result
    }


}

fun iterateOverDateRange(firstDate: MyDate, secondDate: MyDate, handler: (MyDate) -> Unit) {
    for (date in firstDate..secondDate) {
        handler(date)
    }
}
