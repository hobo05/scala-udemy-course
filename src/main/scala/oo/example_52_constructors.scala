package oo

object example_52_constructors extends App {

  class Rectangle(l: Double, b: Double) {
    val length: Double = l
    val breadth: Double = b

    // auxiliary constructor
    def this(s: Double) = this(s, s)

    def getArea: Double = l * b

    override def toString = s"I am a rectangle, l=$length, b=$breadth"
  }

  var rect = new Rectangle(4, 5)
  rect = new Rectangle(3)
  val rectList = List(new Rectangle(3, 4), rect)

  class Fraction(n: Double, d: Double = 1) {
    val numer: Double = n
    val denom: Double = d

    def getFraction: Double = numer / denom

  }

}