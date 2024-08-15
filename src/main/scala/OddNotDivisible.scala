object OddNotDivisible {
  def main(args: Array[String]): Unit = {
    var num = 15;
    if (num %2 !=0 && num % 4 != 0) {
      println("The given number is both odd and not divisible by 4 ")
    } else {
      println("The number is even and divisible by 4 ")
    }
  }
}
