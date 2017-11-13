import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeInterval: TimeInterval) = this.addTimeIntervals(timeInterval,1)

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}


data class MultipliedTimeInterval(val interval: TimeInterval, val count: Int)
operator fun TimeInterval.times(count: Int) = MultipliedTimeInterval(this, count)
operator fun MyDate.plus(multiInterval: MultipliedTimeInterval) =
        this.addTimeIntervals(multiInterval.interval, multiInterval.count)



fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}
