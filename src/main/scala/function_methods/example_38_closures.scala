package function_methods

import java.util.Calendar

object example_38_closures {
  def main(args: Array[String]) {
    val greetEnglish = greeting("English")
    greetEnglish("Swetha")

    Thread.sleep(1000)

    // Even with a sleep, the currDate variable produces the same text
    val greetSpanish = greeting("Spanish")
    greetSpanish("Janani")
  }

  def greeting(lang: String): String => Unit = {
    // This variable is basically cached after the first call
    val currDate = Calendar.getInstance().getTime.toString
    lang match {
      case "English" => (x: String) => println("Hello " + x + ". It is " + currDate)
      case "Hindi" => (x: String) => println("Namaste " + x + ". It is " + currDate)
      case "French" => (x: String) => println("Bonjour " + x + ". It is " + currDate)
      case "Spanish" => (x: String) => println("Hola " + x + ". It is " + currDate)
    }
  }
}
