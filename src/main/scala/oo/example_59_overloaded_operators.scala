package oo

object example_59_overloaded_operators extends App {

  class ComplexNumber(r: Double, i: Double) {
    val realPart: Double = r
    val imaginaryPart: Double = i

    def +(that: ComplexNumber): ComplexNumber =
      new ComplexNumber(
        this.realPart + that.realPart,
        this.imaginaryPart + that.imaginaryPart
      )

    override def toString = s"($realPart,$imaginaryPart)"
  }

  val c1 = new ComplexNumber(5,10)
  val c2 = new ComplexNumber(1,3)
  val sum = c1 + c2

  println(s"sum=$sum")

}