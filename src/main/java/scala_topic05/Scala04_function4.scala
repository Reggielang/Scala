package scala_topic05

object Scala04_function4 {
  def main(args: Array[String]): Unit = {
    //todo 递归函数 --
    def test():Unit={
      test()
      println("test")
    }

    //尾递归 --不是正的递归，是由编译器进行了优化形成了while循环
    def test1():Unit={
      println("test")
      test1()

    }

  }
}
