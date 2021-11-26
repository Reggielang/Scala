package scala_topic02

object Scala07_datatype3 {
  def main(args: Array[String]): Unit = {
    //todo 数据类型

    var a:Any = "123"

    a= 1

    //

  }
  //Nothing 是Scala中的特殊的类型，用于统一方法的异常和正常的返回
  def test():Nothing={
    throw new Exception()
  }
}
