package collections

object example_50_util_Try extends App {
  val stateCodes = Map("California" -> "CA", "Vermont" -> "VT")

  // runtime error
//  val stateCode = stateCodes("NoSuchState")

  val stateCode2 = util.Try(stateCodes("NoSuchState"))

  println(stateCode2 match {
    case util.Success(code) => code
    case util.Failure(error) => s"something terrible happened! error=$error"
  })
}