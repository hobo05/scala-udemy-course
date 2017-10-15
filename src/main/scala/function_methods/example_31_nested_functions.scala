package function_methods

object example_31_nested_functions extends App {
  val radius = 10.0

  val getCircleStats = (r: Double) => {
    val PI = 3.14
    val getCircleArea = (r: Double) => PI * r * r
    val getCircleCircumference = (r: Double) => 2 * PI * r
    (getCircleArea(r), getCircleCircumference(r))
  }

  println(getCircleStats(radius))

}