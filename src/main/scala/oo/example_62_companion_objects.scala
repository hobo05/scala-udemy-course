package oo

object example_62_companion_objects extends App {

  object NYTimesAccount {
    private val userName = "vitthal"
    private val password = "boo"

    def apply() = new NYTimesAccount

  }

  // This is scala's way to utilize factory pattern
  class NYTimesAccount {
    private val accountDetails = Map(
      "user" -> NYTimesAccount.userName,
      "password" -> NYTimesAccount.password
    )
    println(s"Hi " + accountDetails("user"))
  }

  val nytAccount = NYTimesAccount()
}