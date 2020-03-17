object Solution700 {
  def moveZeroes(nums: Array[Int]): Unit = {
    val count = nums.indices.foldLeft(0) {
      case (acc, e) =>
        if (nums(e) != 0) {
          nums(acc) = nums(e)
          acc + 1
        } else acc
    }
    for (i <- count until nums.length) nums(i) = 0
  }
}

object _283_Move_Zeroes {

}
