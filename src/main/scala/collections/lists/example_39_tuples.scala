package collections.lists

object example_39_tuples extends App {
  val personInfo = ("Vitthal", "Srinivasan", 36, "M")

  println(personInfo)
  println(s"age=${personInfo._3}")

  val genderPair = "Vitthal" -> "M"


  // decomposition of all variables
  val (firstName, lastName, age, gender) = personInfo

  // decomposition while omitting irrelevant variables
  val (_, _, onlyAge, _) = personInfo
  println(s"onlyAge=$onlyAge")

  // iterating over tuple values
  personInfo.productIterator.foreach { i => println("Value = " + i) }

  def printPersonGender(name: String, gender: String): Unit = println(s"Name:$name M/F:$gender")

  // passing in a tuple to a function, params must match in arity and type
  (printPersonGender _).tupled(genderPair)

  // prints the number of values in tuple
  println(s"personInfo.productArity=${personInfo.productArity}")
}
