object SeniorStudentDiscount {
  def main(args:Array[String]):Unit={
    val age = 70;
    if(age >60 && age<25)
      print("The person is eligible for senior citizen discount or student discount");
    else
      print("The person is not eligible for both")

  }
}
