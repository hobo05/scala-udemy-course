package oo

object example_57_lazy_values extends App {

  class LazyRectangle(l: Double, b: Double) {
    val length: Double = l
    val breadth: Double = b
    val getArea: Double = {
      println("initialising area"); l * b
    }
    lazy val perimeter: Double = {
      println("initialising perimeter"); 2 * (length + breadth)
    }
  }

  val r = new LazyRectangle(5, 20)
  println("something statement")
  r.perimeter

}