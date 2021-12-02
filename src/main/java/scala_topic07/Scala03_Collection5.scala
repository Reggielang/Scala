package scala_topic07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection5 {
  def main(args: Array[String]): Unit = {
    //todo 集合-方法
    val array= ArrayBuffer(1,2,3,4)

    //功能函数：由集合对象提供函数执行自定义的功能
    //1.map -- 转换 =K->V
    //map方法需要传递一个参数，这个参数的类型为函数类型Int=>B
    println(array.map(_ * 2))


  }

}
