package collections.lists

object example_42_lists_higher_order_functions extends App {
  //creating a list
  val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri")

  weekDays.foreach(c => println(c))

  val printValue = (x: Any) => {
    println(x)
  }: Unit

  println(s"weekDays.map(_ == 'Mon')=${weekDays.map(_ == "Mon")}")

  val IsManicMonday = (x: String) => {
    x == "Mon"
  }: Boolean

  println(s"weekDays.map(IsManicMonday)=${weekDays.map(IsManicMonday)}")

  println(s"weekDays.filter(IsManicMonday)=${weekDays.filter(IsManicMonday)}")

  println(s"weekDays.map(_ != 'Mon')=${weekDays.map(_ != "Mon")}")

  // Tells the list to sort by the first character of each element
  println(s"weekDays.sortBy(_ (0))=${weekDays.sortBy(_ (0))}")
}