package collections.lists

object example_46_forall extends App {
  val someNumbers = List(10, 20, 30, 40, 50, 60)
  val weekDays = List("Mon", "Tue", "Wed", "Thu", "Fri")
  val weekEnds = List("Sat", "Sun")

  val allDays = weekDays ++ weekEnds

  println(s"allDays forall (_ != 'monday')=${allDays forall (_ != "monday")}")

  println(s"allDays endsWith weekEnds=${allDays endsWith weekEnds}")

  println(s"allDays startsWith weekDays=${allDays startsWith weekDays}")
}