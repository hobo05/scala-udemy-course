package loops

object example_20_nested_iterators extends App {
  val daysOfWeekList = List("Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

  for {i <- 0 until 7
       j <- 0 to 10} {
    println(s"$i,$j")
  }

  for {i <- 0 until 7
       j <- daysOfWeekList} {
    println(s"$i,$j")
  }
}






