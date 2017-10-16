package oo

object example_58_apply extends App {

  class LazyRectangle(l: Double, b: Double) {
    val length: Double = l
    val breadth: Double = b
  }

  class AreaCalculator {
    def apply(s: LazyRectangle): Double = s.length * s.breadth
  }

  val lazyRect = new LazyRectangle(4, 5)
  val areaCalc = new AreaCalculator()
  areaCalc(lazyRect)

}