package cases

object example_14_pattern_guard_OR extends App {

  val dayOfWeek1 = "Friday"

  val typeOfDay1 = dayOfWeek1 match {
    case "Monday" => "Manic Monday"
    case "Sunday" | "Saturday" => "Lazy weekend"
    case "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Other working day"
  }

  println(s"typeOfDay1=$typeOfDay1")

  val dayOfWeek2 = "Sunday"
  val typeOfDay2 = dayOfWeek2 match {
    case "Monday" => "Manic Monday"
    case "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "Other working day"
    case someOtherDay if someOtherDay == "Sunday" => "Sleepy Sunday"
    case someOtherDay if someOtherDay == "Saturday" => "Sizzing Saturday"
  }

  println(s"typeOfDay2=$typeOfDay2")
}



