package collections.sets_and_maps

object example_47_sets_and_maps extends App {

  val stateCodes = Map(
    "California" -> "CA",
    "New York" -> "NY",
    ("Vermont", "VT")
  )

  println(s"stateCodes('Vermont')=${stateCodes("Vermont")}")

  println(s"stateCodes.contains('California')=${stateCodes.contains("California")}")

  println(s"stateCodes.contains('Georgia')=${stateCodes.contains("Georgia")}")

  println(s"stateCodes.foreach((p: (String, String)) => println(p._1 + '=' + p._2))=")
  stateCodes.foreach((p: (String, String)) => println("\t%s=%s".format(p._1, p._2)))

  val states = List("California", "New York", "Vermont")
  val codes = List("CA", "NY", "VT")

  // converting two lists into a map
  val stateCodes2 = (states zip codes).toMap
  println(s"stateCodes2 == stateCodes=${stateCodes2 == stateCodes}")

  println(s"stateCodes.keySet.toList=${stateCodes.keySet.toList}")
  println(s"stateCodes.values.toList=${stateCodes.values.toList}")

}