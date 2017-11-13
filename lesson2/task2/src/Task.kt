class DateRange(val start: MyDate, val endInclusive: MyDate){
    operator fun contains(d: MyDate)  = when(d){
        in start..endInclusive -> true
        else -> false
    }
}

fun checkInRange(date: MyDate, first: MyDate, last: MyDate): Boolean {
    return date in DateRange(first, last)
}
