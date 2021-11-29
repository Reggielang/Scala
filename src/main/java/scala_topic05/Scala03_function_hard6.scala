package scala_topic05

object Scala03_function_hard6 {
  def main(args: Array[String]): Unit = {
    //todo 3.函数作为返回值
    def test ():Unit={
      println("fun...")
    }

    def fun ():()=>Unit={
      test _
    }

//    val f = fun _
//    val ff =f()
//    ff()

//    fun()()

    test()

    // todo 将函数作为返回值返回，一般应用于将内部的函数在外部使用
    //这种方式不推荐自己定义类型
    def outer()={
      def inner():Unit={
        println("inner...")
      }
      inner _
    }

    outer()()

  }
}
