package scala_topic05

object Scala04_function5 {
  def main(args: Array[String]): Unit = {
    //todo 惰性函数
    // 函数结果没使用，这个函数就不会执行
    def fun9(): String = {
      println("function...")
      "zhangsan"
    }
    lazy val a = fun9()
    println("----------")
    println(a)

  }
}
