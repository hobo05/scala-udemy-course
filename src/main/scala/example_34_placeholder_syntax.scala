object example_34_placeholder_syntax extends App {

  def IsSpecialName(firstName: String, lastName: String): Boolean = {
    firstName == "Donald" && lastName == "Trump"
  }

  def IsVIP(firstName: String, lastName: String, IsHighStatus: (String, String) => Boolean): Boolean = {
    IsHighStatus(firstName, lastName)
  }

  println(IsVIP("Donald", "Trump", IsSpecialName))

  println(IsVIP("Donald", "Truman", _ == "Donald" && _ == "Trump"))

}