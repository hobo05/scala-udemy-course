object example_26_param_default_vals extends App {

  val radius = 10.0

  def getCircleStats(r: Double, PI: Double = 3.14) = {
    def getCircleArea(r: Double) = PI * r * r

    def getCircleCircumference(r: Double) = 2 * PI * r

    (getCircleArea(r), getCircleCircumference(r))
  }


  def getCircleStats2(PI: Double = 3.14, r: Double) = {
    def getCircleArea(r: Double) = PI * r * r

    def getCircleCircumference(r: Double) = 2 * PI * r

    (getCircleArea(r), getCircleCircumference(r))
  }

  getCircleStats(r = 10.0)

}