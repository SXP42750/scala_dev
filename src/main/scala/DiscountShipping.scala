object DiscountShipping {
  def main(args:Array[String]):Unit={
    val amount = 110;
    if (amount > 150 || amount > 100 ) {
      println("The customer is eligible for a discount or qualifies for free shipping")
    } else {
      println("The customer is not eligible for neither discount or free shipping")
    }

  }
}
