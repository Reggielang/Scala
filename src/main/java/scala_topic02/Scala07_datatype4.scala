package scala_topic02

object Scala07_datatype4 {
  def main(args: Array[String]): Unit = {
    //todo 数据类型
    //编译器将类型进行了转换，隐式转换
//    val b: Byte = 20
//    val i: Int = b

    //常量计算在编译时就完成了
    val c:Char = ('A'+1)
    print(c)

    //所有的类型都可以转换为字符串
    val b:Byte =20
    b.toString

    //字符串也可以转换为数字
    val s = "123"
    val i = s.toInt
    print(s)

  }
}
