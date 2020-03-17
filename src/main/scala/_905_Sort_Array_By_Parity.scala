import scala.collection.mutable

object Solution905 {
  def sortArrayByParity(A: Array[Int]): Array[Int] = {
    //A.filter(x => x % 2 == 0) ++ A.filter(x => x % 2 != 0)
    val deq = new mutable.ArrayDeque[Int]()
    A.foreach(x => if (x % 2 == 0) deq.prepend(x) else deq.append(x))
    deq.toArray
  }
}

object _905_Sort_Array_By_Parity {

}
