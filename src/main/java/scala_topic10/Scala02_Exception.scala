package scala_topic10

import java.io.FileInputStream

object Scala02_Exception {
  def main(args: Array[String]): Unit = {
    //todo 异常


  }
  @throws[Exception]
  def test():Unit={
    throw new Exception("abc")
  }
}
