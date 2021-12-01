package scala_topic07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection2 {
  def main(args: Array[String]): Unit = {
    //todo 集合-方法
    val array= ArrayBuffer(1,2,1,4)

    //从集合中获取部分数据
    println(array(0))
    println(array.head)
    println(array.last)
    println(array.tail)
    println(array.tails)
    println(array.init)//初始
    println(array.inits)//初始

    //取前几个
    println(array.take(2))
    //后几个
    println(array.takeRight(2))

    println(array.dropRight(1))


    
  }

}
