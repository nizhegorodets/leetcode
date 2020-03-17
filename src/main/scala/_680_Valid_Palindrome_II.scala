object Solution680 {
  def validPalindrome(s: String): Boolean = {
    val firstRun = true
    warpValidPalindrome(s, firstRun)
  }

  def warpValidPalindrome(s: String, firstRun: Boolean): Boolean = {
    if (s.isEmpty) return true
    if (s.head == s.last) warpValidPalindrome(s.drop(1).dropRight(1), firstRun) else {
      if(firstRun){
        val left = warpValidPalindrome(s.drop(1), false)
        val right = warpValidPalindrome(s.dropRight(1), false)
        (left || right)
      }
      else
        false
    }
  }
}

object _680_Valid_Palindrome_II extends App {
  println(Solution680.validPalindrome("eeccccbebaeeabebccceea"))
}
