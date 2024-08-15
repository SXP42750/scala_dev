object Divisible2OR3 {
  def main(args: Array[String]): Unit = {
    var num = 9;
    if (num % 2 == 0 || num % 3 == 0) {
      println("The given number is divisible by either 2 or 3 ")
    } else {
      println("The number is neither divisible by both")
    }
  }
}
