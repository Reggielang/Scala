package scala_topic02

import java.io.{File, PrintWriter}

object Scala03_IO2 {
  def main(args: Array[String]): Unit = {
    //todo IO
   val writer =  new PrintWriter(new File("output/test.txt"))
    writer.write("hello scala")
    writer.close()

  }

}
