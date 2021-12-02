package scala_topic07

object Scala04_WordCount5 {
  def main(args: Array[String]): Unit = {
    //todo wordcount
    val list = List(
      ("Hello Scala",4),
      ("Hello World",2)
    )

    //("Helo Scala",4)=>("Hello",4),("Scala",4)
    val list1 = list.flatMap(
      t => {
        val line = t._1
        val cnt = t._2
        val datas = line.split(" ") //Hello,Scala =>(Hello,4),(Scala,4)
        datas.map(
          word => {
            (word, cnt)
          }
        )
      }
    )

    println(list1)
    val groupData = list1.groupBy(_._1)

    println(groupData)
    /*
     Map(
     Hello -> List((Hello,4), (Hello,2)),
     Scala -> List((Scala,4)),
     World -> List((World,2))
     )


     Map(
      Hello->6
      Scala->4
      World->2
      )
     */

    val groupData1 = groupData.mapValues(
      list => {
        list.map(_._2).sum
      }
    )

    println(groupData1)










  }

}
