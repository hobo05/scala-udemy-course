package collections

object example_49_option extends App {
  def fraction(numer: Double, denom: Double): Option[Double] = {
    if (denom == 0)
      None
    else
      Option(numer / denom)
  }

  val piOption = fraction(10, 0)
  val result = piOption match {
    case Some(pi) => pi
    case None => "Something bad happened"
  }

  println(s"result=$result")
}