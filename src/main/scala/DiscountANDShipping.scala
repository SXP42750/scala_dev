object DiscountANDShipping {
  def main(args:Array[String]):Unit={
    val amount = 200;
    if (amount > 150 && amount > 100 ) {
      println("The customer is eligible for a discount and qualifies for free shipping")
    } else {
      println("The customer is not eligible for neither discount and free shipping")
    }

  }
}
