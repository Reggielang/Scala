package scala_topic07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection4 {
  def main(args: Array[String]): Unit = {
    //todo 集合-方法
    val array= ArrayBuffer(1,2,3,4)
    val num = 5

    //折叠
    println(array.fold(5)(_ + _))

    println(array.foldLeft(5)(_ - _))

    //reversed.foldLeft(z)((x,y)=>op(y,x))
    println(array.foldRight(5)(_ - _))

    println(array.scan(5)(_ - _))
    println(array.scanLeft(5)(_ - _))
    println(array.scanRight(5)(_ - _))



  }

}
