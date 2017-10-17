package oo

object example_65_self_type extends App {

  case class Person(firstName: String, lastName: String)

  // any class that extends dorm resident also has to be a person
  trait DormResident {
    self: Person =>
    val livesOnCampus = true
  }

  // will not compile since it doesn't extend person
//  class Student(f: String, l: String) extends DormResident

//  DormResident;

  class Student2(f: String, l: String) extends Person(f, l) with DormResident

  val person1 = new Student2("Vitthal", "Srinivasan")

  // This can take the place of the student class
  val person2 = new Person("Vitthal", "S") with DormResident

}