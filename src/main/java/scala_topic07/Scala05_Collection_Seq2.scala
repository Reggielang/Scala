package scala_topic07

import scala.collection.mutable.ListBuffer

object Scala05_Collection_Seq2 {
  def main(args: Array[String]): Unit = {
    //todo 集合-Seq
    //数据有序(插入的数据在哪里就在哪里，不是排序有序)，可以放重复数据
    val list = List(1,3,4,2)

    println(list)

    //可变seq
    val listbuffer = ListBuffer(1, 3, 4, 2, 1)

//    listbuffer.append()
//    listbuffer.appendAll()
//    listbuffer.insert()

    listbuffer.update(0,5)
    println(listbuffer)

    //产生了一个新集合
    listbuffer.updated(0,6)
    println(listbuffer)

//    listbuffer.remove(1)
//    listbuffer.remove(1,2)
//
//    listbuffer.mkString()
//    listbuffer.iterator()
//    listbuffer.foreach()








  }

}
