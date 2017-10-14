object example_16_match_type extends App {
  var radius1: Any = 10

  println(radius1 match {
    case radius1: Int => "Integer"
    case radius1: String => "String"
    case radius1: Double => "Double"
    case _ => "Any"
  })

// Error
//  val radius2: String = "10"
//
//  println(radius2 match {
//    case radius2: Int => "Integer"
//    case radius2: String => "String"
//    case radius2: Double => "Double"
//    case _ => "Any"
//  })


  val radius3: Any = "10"

  println(radius3 match {
    case radius3: Int => "Integer"
    case radius3: String => "String"
    case radius3: Double => "Double"
    case _ => "Any"
  })
}