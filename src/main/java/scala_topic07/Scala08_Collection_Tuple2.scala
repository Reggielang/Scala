package scala_topic07


object Scala08_Collection_Tuple2 {
  def main(args: Array[String]): Unit = {
    //todo 集合-tuple
    //如果元组中的元素只有2个，称为对偶元组，也叫键值对
    val kv = (1,"zhangsan")

    val map = Map(
      ("a",1),("b",2),("c",3)
    )

    map.foreach(t=>println(t._1+"="+t._2))

    //将map转换为list
    val list = map.toList
    println(list)


  }

}
