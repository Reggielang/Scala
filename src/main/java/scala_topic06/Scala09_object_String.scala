package scala_topic06

object Scala09_object_String {
  def main(args: Array[String]): Unit = {
    //不可变字符串，是指字符串数组的内存地址不可变，但内容其实可以改变的。通过反射取到本身，然后可以进行处理
    val s = " a b "

    //反射：类型信息
    val value:Class[String] = classOf[String]
    val field = value.getDeclaredField("value")
    field.setAccessible(true)
    val obj = field.get(s)
    val chars = obj.asInstanceOf[Array[Char]]
    chars(2) = 'D'

    println(s)

  }
}
