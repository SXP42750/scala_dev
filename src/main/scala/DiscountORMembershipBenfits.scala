object DiscountORMembershipBenfits {
  def main(args: Array[String]): Unit = {
    val Purchase_Amount = 180
    val LoyaltyCard = "true"

    if(Purchase_Amount >200 || LoyaltyCard =="true")
      println("The Customer is eligible for a discount or qualifies for membership benefits")
    else
      print("The customer is neither eligible for discount nor membership benefits")


  }
}
