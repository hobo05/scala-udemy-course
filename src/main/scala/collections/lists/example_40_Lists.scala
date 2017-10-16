package collections.lists

object example_40_Lists extends App {
  // creating a list
  val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri")

  // creating a list using the "cons" operator and "Nil"
  val weekDays2 = "Mon" :: "Tue" :: "Wed" :: "Thu" :: "Fri" :: Nil

  val weekendDays = List("Sat", "Sun")

  val daysAgain = List(weekDays, weekendDays).flatten

  val days = weekDays ::: weekendDays

  val days2 = weekDays ++ weekendDays

  val dayIndices = List(1, 2, 3, 4, 5, 6, 7)

//  dayIndices zip allDays
  println(dayIndices zip days)
}