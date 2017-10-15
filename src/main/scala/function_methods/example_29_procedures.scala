package function_methods

//noinspection UnitMethodIsParameterless
object example_29_procedures extends App {

  // considered bad practice to not put parentheses
  def printHello: Unit = print("Hellooo!")

  val printHelloFn = printHello _

  // considered bad practice to call procedure without parentheses
  printHello
  printHelloFn()
}