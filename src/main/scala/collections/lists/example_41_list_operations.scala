package collections.lists

object example_41_list_operations extends App {
  //creating a list
  val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri")

  println(s"weekDays.head=${weekDays.head}")
  // Returns the rest of the list, not just the last element
  println(s"weekDays.tail=${weekDays.tail}")

  println(s"weekDays.size=${weekDays.size}")
  println(s"weekDays.reverse=${weekDays.reverse}")
  println(s"weekDays.reverse=${weekDays.reverse}")

  println(s"weekDays(1)=${weekDays(1)}")

  println(s"weekDays.contains(${'"'}Mon${'"'})=${weekDays.contains("Mon")}")
  println(s"weekDays contains ${'"'}Mon${'"'}=${weekDays contains "Mon"}")


  for (c <- weekDays) println(c)

  weekDays.size

  var restOfWeek = weekDays
  while (restOfWeek.nonEmpty) {
    println(s"Grr..today is ${restOfWeek.head}, ${restOfWeek.size} days left for the weekend")
    restOfWeek = restOfWeek.tail
  }

  restOfWeek = weekDays
  while (restOfWeek != Nil) {
    println(s"Grr..today is ${restOfWeek.head}, ${restOfWeek.size} days left for the weekend")
    restOfWeek = restOfWeek.tail
  }

  val weekEnds = List("Sat", "Sun")
  val weeklyHolidays = List("Sat", "Sun")
  println(s"weekEnds == weeklyHolidays=${weekEnds == weeklyHolidays}")

  // prepend and append values to list
  val nonUniqueWeekDays = ("Mon" :: weekDays) :+ "Fri"
  println(s"nonUniqueWeekDays=$nonUniqueWeekDays")

  // gets unique elemnts
  println(s"nonUniqueWeekDays.distinct=${nonUniqueWeekDays.distinct}")

  // drop first two elements
  println(s"weekDays drop 2=${weekDays drop 2}")

  // extract new list using indices
  println(s"weekDays slice (2,4)=${weekDays slice (2,4)}")

  // splits into two lists
  println(s"weekDays splitAt 2=${weekDays splitAt 2}")

  // new list with first two elements
  println(s"weekDays take 2=${weekDays take 2}")
}