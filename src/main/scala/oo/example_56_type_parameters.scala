package oo

object example_56_type_parameters extends App {

  abstract class Shape(name: String) {
    val shapeName: String = name

    override def toString = s"I am a $shapeName"

    def getArea: Double
  }

  val someShape: Shape = new Shape("Irregular shape") {
    def getArea = 100
  }


  class Rectangle(l: Double, b: Double, shapeName: String = "Rectangle") extends Shape(shapeName) {
    val length: Double = l
    val breadth: Double = b

    override def toString = s"I am a $shapeName, l=$length, b=$breadth"

    def getArea: Double = l * b
  }

  class Square(s: Double) extends Rectangle(s, s, "Square") {
  }

  class AreaCalculator[T](s: T) {
    val shape: T = s

    override def toString: String = shape.toString
  }

  val s = new Shape("newshape") {
    override def getArea = 9
  }
  val r = new Rectangle(5, 20)

  println(s"s=$s, r=$r")

  val a = new AreaCalculator[Shape](s)
  println(s"a=$a")
}