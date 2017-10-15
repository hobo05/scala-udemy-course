package function_methods

object example_23_assigning_methods extends App {
  val PI = 3.14

  val r = 10

  def getCircleArea(r: Double): Double = PI * r * r

  // produces an error
//  val calcCircleArea = getCircleArea

  val calcCircleAreaVal_1: (Double) => Double = getCircleArea

  val calcCircleAreaVal_2 = getCircleArea _


  def getPI() = {
    PI
  }

  val calcPI_1: () => Double = getPI

  val calcPI_2 = getPI _

  def getRectangleArea(l: Double, b: Double): Double = l * b

  val calcRectangleArea_1: (Double, Double) => Double = getRectangleArea

  val calcRectangleArea_2 = getRectangleArea _

}