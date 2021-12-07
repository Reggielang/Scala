package scala_topic10

import java.io.FileInputStream

object Scala01_Exception {
  def main(args: Array[String]): Unit = {
    //todo 异常
    try{
      val j=0
      val i=10/j
    }catch {
      case e:ArithmeticException=>println("算数异常")
      case e:Exception=>println("其他异常")
    }


    //所以Scala中异常没有分类
//    new FileInputStream("xxxxx")

  }
}
