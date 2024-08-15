object Divisible3AND5 {
  def main(args: Array[String]): Unit = {
    var num = 15;
    if (num %3 ==0 && num % 5 == 0) {
      println("The given number is  divisible by both 3 and 5")
    } else {
      println("The number is neither  divisible by 3 and 5")
    }
  }
}
