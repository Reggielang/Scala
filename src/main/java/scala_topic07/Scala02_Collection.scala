package scala_topic07

import scala.collection.mutable.ArrayBuffer

object Scala02_Collection {
  def main(args: Array[String]): Unit = {
    //todo 集合-数组-可变数组
//    val buffer = new ArrayBuffer[String]()
    val buffer = ArrayBuffer("a","b","c")
    println(buffer)
    //TODO 操作
    buffer.append("a","b","c")
    buffer.appendAll(Array("a","b","c"))
//    buffer.insert(100,"f")

    //修改
    buffer.update(0,"e")
    buffer(0)="e"
    //移除
    buffer.remove(2)
    buffer.remove(2,2)

    println(buffer)
    val arrayBuffer = buffer - "a"

    println(buffer eq arrayBuffer)



  }

}
