package function_methods

object example_36_currying extends App {

  def compareStrings(s1: String, s2: String): Int = {
    if (s1 == s2) 0
    else if (s1 > s2) -1
    else {
      1
    }
  }


  def smartCompare(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
    cmpFn(s1, s2)
  }

  def curriedCompare(cmpFn: (String, String) => Int)(s1: String, s2: String): Int = {
    cmpFn(s1, s2)
  }

  val defaultCompare = smartCompare(_: String, _: String, compareStrings)

  val x = curriedCompare(_: (String, String) => Int)("abc", "xyz")
  println(x(compareStrings))

  val y = curriedCompare(compareStrings)(_: String, _: String)
  println(y("abc", "xyz"))

  val z = curriedCompare(_: (String, String) => Int)("abc", _: String)
  println(z(compareStrings, "aaa"))

}