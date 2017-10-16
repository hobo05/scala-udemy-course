package oo

object example_60_access_modifiers extends App {

  class Shape(name: String) {
    protected val shapeName: String = name

    override def toString = s"I am a $shapeName"
  }


  class Rectangle(l: Double, b: Double, shapeName: String = "Rectangle") extends Shape(shapeName) {
    val length: Double = l
    val breadth: Double = b
    private val diagLen = math.sqrt(length * length + breadth * breadth)

    override def toString = s"I am a $shapeName,diagonal = $diagLen"
  }


  class Square(s: Double) extends Rectangle(s, s, "Square") {
    // override def toString = s"I am a $shapeName, l=$length, b=$breadth, diagonal = $diagLen"
    override def toString = s"I am a $shapeName, l=$length, b=$breadth"
  }


  val r = new Rectangle(5, 20)
  val s = new Square(10)
  println(s"r=$r, s=$s")
}