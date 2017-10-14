object example_19_for_loop_pattern_guard extends App {
  val daysOfWeekList = List("Manic Monday", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun")

  for (day <- daysOfWeekList if day == "Manic Monday") {
    println(day)
  }

  for {i <- 0 until 7
        j <- 0 to 10 }
    {
      println(s"$i,$j")
    }
}






