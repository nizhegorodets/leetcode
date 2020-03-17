object Solution136 {
  def singleNumber(nums: Array[Int]): Int = {
    var ans = nums(0)
    for(i <- 1 until nums.length){
      ans ^= nums(i)
    }
    ans
  }
}

object _136_Single_Number {

}
