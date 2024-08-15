object DivisibleOR {
  def main(args:Array[String]):Unit={
    val num = 20;
    if(num%4==0 || num%6==0)
      print("number is divisible by either 4 or 6")
    else
      print("Number is neither divisible by 4 or 6")

  }
}
