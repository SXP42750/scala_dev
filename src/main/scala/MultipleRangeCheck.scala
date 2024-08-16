object MultipleRangeCheck {
  def main(args: Array[String]): Unit = {
    val num = 25

    if ((num >= 1 && num <= 10) || (num >= 20 && num <= 30)) {
      println("The number is within the range.")
    } else {
      println("The number is out of the range.")
    }
  }
}

