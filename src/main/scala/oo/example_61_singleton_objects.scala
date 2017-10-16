package oo

object example_61_singleton_objects extends App {

  object Rational {
    val inf = "infinity"

    def dividyByZero(x: Int): Unit = {
      println("Not defined")
    }
  }

  object PI {
    val shapeName = "PI"

    override def toString = s"I am a $shapeName"
  }

  class Shape(name: String) {
    protected val shapeName: String = name

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
}