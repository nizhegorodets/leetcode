object Solution167 {
  def twoSum(numbers: Array[Int], target: Int): Array[Int] = {
    var j = numbers.length - 1
    for(i <- numbers.indices){
      while (numbers(i) + numbers(j) > target){
        j -= 1
      }
      if (numbers(i) + numbers(j) == target)
        return Array(i + 1, j + 1)
    }
    Array()
  }
}

object _167_Two_Sum_II_Input_array_is_sorted extends App {
  println(Solution167.twoSum(Array(2,7,11,15), 9))
}
