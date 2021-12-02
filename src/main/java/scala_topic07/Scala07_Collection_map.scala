package scala_topic07

import scala.collection.mutable


object Scala07_Collection_map {
  def main(args: Array[String]): Unit = {
    //todo 集合-Map
    val map1 = Map(
      "a"->1,"b"->2
    )


    val map2 = mutable.Map(
      "a"->1,"b"->2
    )

    map2.put("c",3)
    map2.update("a",7)
    map2.remove("b")
    println(map1)
    println(map2)






  }

}
