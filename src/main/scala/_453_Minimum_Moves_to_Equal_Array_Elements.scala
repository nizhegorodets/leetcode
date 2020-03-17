object Solution453 {
  def minMoves(nums: Array[Int]): Int = {
    val minimum = nums.min
    nums.map(x => x - minimum).sum
  }
}

object _453_Minimum_Moves_to_Equal_Array_Elements {

}
