package function_methods

//noinspection EmptyParenMethodAccessedAsParameterless
object example_30_no_input_methods extends App {
  def sayHello(): String = "Hello"

  sayHello

  sayHello()

  def getHello: String = "Hello"

  // can only be called without parentheses since
  // the convention is to use it like a field
  getHello

//  This will not compile
//  getHello()
}