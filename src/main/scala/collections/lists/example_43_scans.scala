package collections.lists

object example_43_scans extends App {
  val someNumbers = List(10, 20, 30, 40, 50, 60)

  // (0) is the initial value of the first application of the reduce function
  // _ - _ means take adjacent items in the list and apply the "-" operator to them
  println(s"someNumbers.scanRight(0)(_ - _)=${someNumbers.scanRight(0)(_ - _)}")
  println(s"someNumbers.scanLeft(0)(_ - _)=${someNumbers.scanLeft(0)(_ - _)}")
  println(s"someNumbers.scan(0)(_ - _)=${someNumbers.scan(0)(_ - _)}")

  println(s"someNumbers.foldRight(0)(_ - _)=${someNumbers.foldRight(0)(_ - _)}")
  println(s"someNumbers.foldLeft(0)(_ - _)=${someNumbers.foldLeft(0)(_ - _)}")
  println(s"someNumbers.fold(0)(_ - _)=${someNumbers.fold(0)(_ - _)}")

  println(s"someNumbers.reduceRight(_ - _)=${someNumbers.reduceRight(_ - _)}")
  println(s"someNumbers.reduceLeft(_ - _)=${someNumbers.reduceLeft(_ - _)}")
  println(s"someNumbers.reduce(_ - _)=${someNumbers.reduce(_ - _)}")

}