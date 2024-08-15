object Divisiblilty5OR9 {
  def main(args: Array[String]): Unit = {
    var num = 27;
    if (num % 5 == 0 || num % 9 == 0) {
      println("The given number is a divisible by either 5 or 9")
    } else {
      println("The number is neither  divisible by 5 nor 9")
    }
  }
}
