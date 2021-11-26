package scala_topic02

import test.User

object Scala07_datatype1 {
  def main(args: Array[String]): Unit = {
    //todo 数据类型
    val list:AnyRef = List(1,2,3)
    val obj:AnyRef = new User()
    val obj1:AnyRef = Scala07_datatype1

    print(list)
    print(obj)
    print(obj1)

  }

}
