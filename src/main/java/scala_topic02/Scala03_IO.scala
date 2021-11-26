package scala_topic02

import scala.io.{BufferedSource, Source, StdIn}

object Scala03_IO {
  def main(args: Array[String]): Unit = {
    //todo IO
    //read -- 读取控制台
    val line:String = StdIn.readLine()
    print(line)

    //从文件中获取输入
    // 绝对路径 --不可改变的路径
    //本地路径：file://c:/test/test.txt
    //网络路径：http://www.xxx.com

    //相对路径 -- 可以改变的路径，一定存在一个基准路径
    // ./ ==当前路径(可以省略)
    // ../ ==当前路径的上一级路径
    // IDEA中基准路径为项目的根路径
    val source:BufferedSource = Source.fromFile("data/word.txt")

    val strings:Iterator[String] = source.getLines()

    while (strings.hasNext){
      print(strings.next())
    }

    source.close()
  }

}
