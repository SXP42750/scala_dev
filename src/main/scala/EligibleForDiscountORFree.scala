object EligibleForDiscountORFree {
  def main(args:Array[String]):Unit={
    val age = 27;
    val FreeTrial_Status = "true"
    if(age<25 || FreeTrial_Status =="true")
      print("Person is Eligible for Student Discount or free Trial ")
    else
      print("Person is not eligible for student discount")

  }
}
