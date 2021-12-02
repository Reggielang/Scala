package scala_topic07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection6 {
  def main(args: Array[String]): Unit = {
    //todo 集合-方法
    val array= ArrayBuffer(Array(1,2),Array(3,4))

    //将整体拆分成个体的操作--称为扁平化 --只能对最外层操作
    println(array.flatten)

    val array2 = Array("Hello World","Hello Hadoop")
    println(array2.flatten.mkString(","))

    println(array2.flatMap(
      str => {
        str.split(" ")
      }
    ).mkString(","))


  }

}
