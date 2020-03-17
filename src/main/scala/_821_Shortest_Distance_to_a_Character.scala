object Solution821 {
  def shortestToChar(S: String, C: Char): Array[Int] = {
    val ans = new Array[Int](S.length)
    var distance = S.length
    // left to right
    for(i <- 0 until S.length){
      if(S(i) == C){
        distance = 0
      }
      else{
        distance += 1
      }
      ans(i) = distance
    }

    // right to left
    distance = S.length
    for(i <- S.length - 1 to 0 by -1){
      if(S(i) == C){
        distance = 0
      }
      else{
        distance += 1
      }
      ans(i) = scala.math.min(distance, ans(i))
    }
    ans
  }
}

object _821_Shortest_Distance_to_a_Character {

}
