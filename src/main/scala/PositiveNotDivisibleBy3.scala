object PositiveNotDivisibleBy3 {
  def main(args: Array[String]): Unit = {
    var num = 7;
    if (num >0 && num % 3!= 0) {
      println("The given number is positive and not divisible by 3")
    } else {
      println("The number is positive and divisible by 3")
    }
  }
}
