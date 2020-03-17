object Solution125 {
  def isPalindrome(s: String): Boolean = {
    val filteredS = s.filter(_.isLetterOrDigit).toLowerCase

    if (filteredS.isEmpty)
      true
    else{
      if (filteredS.head == filteredS.last) isPalindrome(filteredS.drop(1).dropRight(1)) else false
    }
  }
}
