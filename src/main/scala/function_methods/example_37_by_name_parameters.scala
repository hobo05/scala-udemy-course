package function_methods

object example_37_by_name_parameters extends App {
  def voteForMrTrump(x: String): String = {
    println("method invoked")
    x
  }

  def sayHelloToMrTrump(name: => String): String = {
    // First evaluation
    println(s"$name, Meet the President!")
    // Second evaluation, the method that generates name is called again
    name
  }


  sayHelloToMrTrump("Vitthal")
  sayHelloToMrTrump(voteForMrTrump("Vitthal"))
  println("== End of first part ==\n")


  def sayHelloToMrTrump2(name: String): String = {
    println(s"$name, Meet the President!")
    name
  }

  sayHelloToMrTrump2("Vitthal")
  sayHelloToMrTrump2(voteForMrTrump("Vitthal"))

}