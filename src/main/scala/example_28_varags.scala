object example_28_varags extends App {

  def concatStrings(strings: String*) = {
    var builtUpString = ""
    for (s <- strings) builtUpString = builtUpString + " " + s
    builtUpString
  }

  println(concatStrings("A", "B", "C"))
}