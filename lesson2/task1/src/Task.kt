import java.util.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(other: MyDate) = Date(year, month, dayOfMonth).compareTo(Date(other.year,other.month,other.dayOfMonth))
}

fun compare(date1: MyDate, date2: MyDate) = date1 < date2
