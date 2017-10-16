package oo

object example_53_inheritance extends App {

  class Shape(name: String) {
    val shapeName: String = name

    override def toString = s"I am a $shapeName"
  }


  class Rectangle(l: Double, b: Double, shapeName: String = "Rectangle") extends Shape(shapeName) {
    val length: Double = l
    val breadth: Double = b

    override def toString = s"I am a $shapeName, l=$length, b=$breadth"
  }

  class Square(s: Double) extends Rectangle(s, s, "Square") {

  }


  val s = new Shape("Circle")
  val r = new Rectangle(5, 20)

  println(s"s=$s, r=$r")
  println(s"square=${new Square(5)}")

}