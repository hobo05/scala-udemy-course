object example_22_functions extends App {

  val getRectangleArea = (length: Double, breadth: Double) => {
    length * breadth
  }: Double

  val getRectangleArea2 = (length: Double, breadth: Double) => {
    length * breadth
  }

  val area = getRectangleArea(5, 8)
  println(s"area=$area")
}