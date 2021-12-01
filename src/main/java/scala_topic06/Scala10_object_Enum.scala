package scala_topic06

object Scala10_object_Enum {
  def main(args: Array[String]): Unit = {
    println(Color.RED)


  }
}
// 枚举类
object Color extends Enumeration {
  val RED = Value(1, "red")
  val YELLOW = Value(2, "yellow")
  val BLUE = Value(3, "blue")
}