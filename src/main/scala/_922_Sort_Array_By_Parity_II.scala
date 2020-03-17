object Solution {
  def sortArrayByParityII(A: Array[Int]): Array[Int] = {
    var even = 0
    var odd = 1
    val res = new Array[Int](A.length)
    A.foreach(x => if (x % 2 == 0){
      res(even) = x
      even += 2
    }
    else{res(odd) = x; odd +=2})
    res
  }
}

object _922_Sort_Array_By_Parity_II {

}
