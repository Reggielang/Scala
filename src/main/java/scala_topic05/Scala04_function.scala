package scala_topic05

object Scala04_function {
  def main(args: Array[String]): Unit = {
    //todo 函数式编程

    //方法其实就是函数
  }

  //todo 控制抽象
  def test(op: => Unit)={
   op
  }
  // 参数类型不完整，那么在传递参数时，也是不完整的，只要传递代码就可以，不需要完整的声明
  // 可以采用控制抽象来设计语法
  test(println("zhangsan"))

}
