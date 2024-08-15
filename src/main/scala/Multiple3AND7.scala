object Multiple3AND7 {
  def main(args: Array[String]): Unit = {
    var num = 21;
    if (num % 3 == 0 && num % 7 == 0) {
      println("The given number is a multiple of both 3 and 7")
    } else {
      println("The number is neither a multiple of 3 nor 7")
    }
  }
}
