package scala_topic07

import scala.io.Source

object Scala04_WordCount2 {
  def main(args: Array[String]): Unit = {
    //todo word count
    //todo 1.获取文件，获取原始数据
    val source = Source.fromFile("data/word.txt")
    //line => Hello Scala
    val lines = source.getLines().toArray
    source.close()


    //todo 2.将原始数据进行切分成一个一个的单词
    //"Heloo","Scala"
    val wordcount =
      lines
          .flatMap(_.split(" "))
          .groupBy(word => word)
          .mapValues(_.size)

    println(wordcount)
  }

}
