object Divisible3or8 {
  def main(args: Array[String]): Unit = {
    val num = 24;
    if (num % 3 == 0 || num % 8 == 0) {
      println("The give number is divisible by either 3 or 8")
    }
    else {
      println("The number is neither divisible by 3 or 8")
    }
  }
}
