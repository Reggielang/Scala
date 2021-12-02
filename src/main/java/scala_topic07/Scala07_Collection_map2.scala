package scala_topic07

import scala.collection.mutable


object Scala07_Collection_map2 {
  def main(args: Array[String]): Unit = {
    //todo 集合-Map
    //java从hashmap获取一个不存在的key,会返回null
    //HashMap允许放空键，空值
    val map2 = mutable.Map(
      "a"->1,"b"->2
    )


    val maybeInt = map2.get("a")

    //专门为了解决空指针而设计的
    //Option:选项，对象只有两个，Some,None

//    if (maybeInt.isEmpty){
//      println("没有对应的key的值")
//    }else{
//      println("对应的key值是 " + maybeInt.get)
//    }

    println("获取指定key的值 " + maybeInt.getOrElse(0))


    map2.getOrElse("a",0)


    map2


  }

}
