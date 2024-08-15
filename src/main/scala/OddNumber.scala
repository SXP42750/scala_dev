object OddNumber {
  def main(args:Array[String]):Unit={
  val num = 27;
    if(num%2!=0 && num%3!=0)
    print("number is odd and not divisible by 3 ")
    else if(num % 2 != 0 && num %3 ==0)
      print("The number is odd and divisible by 3.")
    else
    print("Number is even")

  }

}
