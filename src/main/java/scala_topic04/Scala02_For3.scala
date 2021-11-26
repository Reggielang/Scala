package scala_topic04

object Scala02_For3 {
  def main(args: Array[String]): Unit = {
      //todo for循环
      //表达式的返回值
    val result = for(i<- 1 to 5) yield {
      i * 2
    }
    println(result)
  }

}
