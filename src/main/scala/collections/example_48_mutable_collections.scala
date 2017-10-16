package collections

object example_48_mutable_collections extends App {
  val someNumbers = collection.immutable.List(10, 20, 30, 40, 50, 60)
  val stateCodes = collection.immutable.Map("California" -> "CA", ("Vermont", "VT"))
  val stateSet = collection.immutable.Set("California", "Vermont")

  val someNumbers2 = collection.mutable.Buffer(10, 20, 30, 40, 50)
  val stateCodes2 = collection.mutable.Map("California" -> "CA", ("Vermont", "VT"))
  val stateSet2 = collection.mutable.Set("California", "Vermont")

  val listBuilder = List.newBuilder[Int]
  someNumbers.foreach(listBuilder += _)
  val reconstructedList = listBuilder.result
  println(s"reconstructedList=$reconstructedList")

  val fiveToOne = Array(5,4,3,2,1)
  println(s"fiveToOne=$fiveToOne")
  fiveToOne(0) = 99
  println(s"fiveToOne=$fiveToOne")
}