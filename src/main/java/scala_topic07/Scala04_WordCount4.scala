package scala_topic07

import scala.io.Source

object Scala04_WordCount4 {
  def main(args: Array[String]): Unit = {
    //todo wordcount
    val list = List(
      ("Helo Scala",4),
      ("Hello World",2)
    )

    val list1 = list.map(
      t => {
        val line = t._1
        val cnt = t._2
        (line+" ") * cnt
      }
    )

    println(list1)








  }

}
