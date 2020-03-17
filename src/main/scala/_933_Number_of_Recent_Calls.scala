import scala.collection.mutable

class RecentCounter() {
  val q = mutable.Queue[Int]()
  def ping(t: Int): Int = {
    q += t
    while (t - q.front > 3000) {
      q.dequeue
    }
    q.length
  }
}

object _933_Number_of_Recent_Calls {

}
