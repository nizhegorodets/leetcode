object Solution258 {
  def addDigits(num: Int): Int = {
    val sum = num.toString.map(_.asDigit).sum
    if (sum > 9) {
      addDigits(sum)
    }
    else
      sum
  }
}

object _258_Add_Digits extends App{
  println(Solution258.addDigits(125))
}
