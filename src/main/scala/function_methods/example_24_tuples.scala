package function_methods

object example_24_tuples extends App {
  val area = getRectangleArea(5, 8)

  def getRectangleArea(length: Double, breadth: Double): Double = {
    length * breadth
  }

  println(s"area=$area")

  val area2 = getRectangleArea(5, 8)
  println(s"area2=$area2")

  val perimeterOfSquare = 20.0

  println((getRectangleArea _).tupled({
    val sideOfSquare = perimeterOfSquare / 4; (sideOfSquare, sideOfSquare)
  }))

}

