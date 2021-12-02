package scala_topic07

import scala.io.Source

object Scala04_WordCount3 {
  def main(args: Array[String]): Unit = {
    //todo 1.获取文件，获取原始数据
    val source = Source.fromFile("data/word.txt")
    //line => Hello Scala
    val lines = source.getLines().toArray
    source.close()

    //todo 2.将原始数据进行切分成一个一个的单词
    //"Heloo","Scala"
    val words = lines.flatMap(
      line => {
        line.split(" ")
      }
    )

    //todo 3.对分词的结果进行分组操作（相同的单词放在一起）
    val wordgroup = words.groupBy(word => word)
    //{"Hello"=>list(Hello,Hello)}

    //todo 4.对分组之后的数据进行统计
    //{"Hello"=>2} 如果数据在转换时，无需对Key进行操作，只对v进行操作可以使用mapValues方法
//    val wordcount = wordgroup.mapValues(
//      v => {
//        v.size
//      }
//    )
    val wordcount = wordgroup.map(
      kv => {
        val k = kv._1
        val v = kv._2
        (k, v.size)
      }
    )

    //todo 5.将统计的结果打印
    println(wordcount)
  }

}
