import scala.collection.mutable.ArrayBuffer

object Solution917 {
  def reverseOnlyLetters(S: String): String = {
    val stack = collection.mutable.Stack[Char]()
    S.toCharArray.map { c =>
      if (c.isLetter) {
        stack.push(c)
        " "
      } else {
        c
      }
    }
      .map { newC =>
        if (newC == " ") {
          stack.pop()
        } else {
          newC
        }
      }
    .mkString
  }
}

object _917_Reverse_Only_Letters extends App {
  println(Solution917.reverseOnlyLetters("a-bC-dEf-ghIj"))
}
