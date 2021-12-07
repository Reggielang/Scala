package scala_topic09

object Scala04_match {
  def main(args: Array[String]): Unit = {
    //todo  元组匹配
   val (id,name,age) = (1,"zhangsan",30)

    println(name)

    val map = Map(
      ("a",1),("b",2),("c",3)
    )

    for(kv<-map){
      println(kv._1+"="+kv._2)
    }

    val list = List(
      (("百度","鞋子"),10),
      (("百度","衣服"),20),
      (("百度","裤子"),15),
    )

    //下面的代码中使用模式匹配，需要注意：
    // 1.匹配数据时，需要case关键字的
    // 2.case分支可能存在多个，需要将map的小括号，换成{}
    val list1 = list.map {
      case ((prv, item), cnt) => {
        (prv, (item, cnt * 2))
      }
    }

    println(list1)



  }
}
