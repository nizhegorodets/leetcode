import scala.io.StdIn

object Main {
  def main(args: Array[String]) {
    val Array(start, end) = StdIn.readLine().split(" ").map(_.toInt)
    val str  = StdIn.readLine()

    println(str.substring(0, start) + str.substring(start, end + 1).reverse +
      str.substring(end + 1, str.length))
  }
}