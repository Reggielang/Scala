package scala_topic07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection {
  def main(args: Array[String]): Unit = {
    //todo 集合-方法
    val array= Array(1,2,1,4)
    println(array.size)
    println(array.length)
    println(array.isEmpty)
    println(array.contains(2))
    println(array.distinct.mkString(","))
    println(array.reverse.mkString(","))

    array.foreach(println)
    array.iterator


  }

}
