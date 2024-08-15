object SeniorDiscountNotNewCustomer {
  def main(args: Array[String]): Unit = {
    val customerAge = 70
    val isNewCustomer = false
    if (customerAge >= 65 && !isNewCustomer) {
      println("Customer qualifies for senior discount and is not a new customer.")
    } else {
      println("Customer does not qualify for senior discount.")
    }
  }
}
