package function_methods

object example_32_higher_order_functions extends App {

  def compareStrings(s1: String, s2: String): Int = {
    if (s1 == s2) 0
    else if (s1 > s2) -1
    else {
      1
    }
  }

  def compareStringsDescending(s1: String, s2: String): Int = {
    if (s1 == s2) 0
    else if (s1 > s2) 1
    else {
      -1
    }
  }

  // Takes in a function as a param
  def smartCompare(s1: String, s2: String, cmpFn: (String, String) => Int): Int = {
    cmpFn(s1, s2)
  }

  // returns a function that takes in two strings and returns an Int
  def getComparator(reverse: Boolean): (String, String) => Int = {
    if (reverse) compareStringsDescending
    else compareStrings
  }
}