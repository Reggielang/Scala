package scala_topic07

import scala.collection.mutable


object Scala08_Collection_Tuple {
  def main(args: Array[String]): Unit = {
    //todo 集合-tuple

    //1,zhangsan,30

    val t = (1,"zhangsan",30)
    //因为元组中的数据没有关系，只能通过顺序号进行访问
    println(t)
    println(t._1)
    //tuple也是集合对象，所以也有类型
    //(Int,String,Int)

    //tuple类型，最多存放的元素的数量为22个。但是类型没有约束



  }

}
