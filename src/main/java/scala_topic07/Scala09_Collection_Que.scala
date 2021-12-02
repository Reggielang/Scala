package scala_topic07

import scala.collection.mutable

object Scala09_Collection_Que {
  def main(args: Array[String]): Unit = {
    //todo 集合-Queue 先放先取
    val que = new mutable.Queue[String]()
    //添加元素
    que.enqueue("a","b","c")

    val que1 = que += "d"

    print(que1 eq que)
    //获取元素
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())

  }

}
