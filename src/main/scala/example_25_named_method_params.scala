object example_25_named_method_params extends App {

  def getRectangleArea(length: Double, breadth: Double) = {
    println(s"l = $length,b = $breadth")
    length * breadth
  }

  getRectangleArea(5, 10)
  getRectangleArea(breadth = 5, length = 10)

  val getRectangleArea2 = (length: Double, breadth: Double) => {
    println(s"l = $length,b = $breadth")
    length * breadth
  }

  getRectangleArea2(5, 10)
//  getRectangleArea(breadth = 5, length = 10) //won't compile
}


