package cases

object example_13_match extends App {
  val dayOfWeek = "Monday"

  val typeOfDay = dayOfWeek match {
    case "Monday" => "Manic Monday"
    case "Sunday" => "Sleepy Sunday"
  }
}
