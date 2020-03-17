import scala.collection.mutable.ArrayBuffer

object Solution925 {
  def isLongPressedName(name: String, typed: String): Boolean = {
    var reg = ""
    for(i <- 0 until name.length){
      reg = reg + name(i)
      if ((i < name.length - 1) && name(i) != name(i + 1)){
        reg = reg + "+"
      }
    }
    reg = s"$reg+"

    val pattern = reg
    typed.matches(pattern)
  }
}

object _925_Long_Pressed_Name extends App {
  println(Solution925.isLongPressedName("alex", "aalllleeex"))
}
