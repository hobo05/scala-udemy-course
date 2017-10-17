package oo

object example_63_traits extends App {

  abstract class Animal {
    def speak
  }

  trait FourLeggedAnimal {
    def walk
    def run
  }

  trait WaggingTail {
    def startTail() { println("tail started")}
    def stopTail() { println("tail stopped")}
  }

  class Dog extends Animal with WaggingTail with FourLeggedAnimal {
    override def speak: Unit = {println("Dog says 'Woof'")}

    override def walk: Unit = {println("Dog is walking")}

    override def run: Unit = {println("Dog is running")}
  }
}
