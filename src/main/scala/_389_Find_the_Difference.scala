object Solution389 {
  def findTheDifference(s: String, t: String): Char = {
    var dict = scala.collection.mutable.Map[Char, Int]()
    t.foreach(x => if (dict contains x) dict(x) = dict(x) + 1 else dict += (x -> 1))
    s.foreach(x => if (dict(x) > 1) dict(x) = dict(x) - 1 else dict -= x)
    dict.keys.toList.head
  }
}

object _389_Find_the_Difference extends App {
  println(Solution389.findTheDifference("abcd", "abcde"))
}


