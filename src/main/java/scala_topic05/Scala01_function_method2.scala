package scala_topic05

object Scala01_function_method2 {
  def main(args: Array[String]): Unit = {
    //todo 函数式编程 --在类中声明的函数称之为方法，其他场合称为函数

    //函数没有重载或重写，但可以嵌套使用
    //函数的作用域比较窄
    def test():Unit={
      println("test function...")
    }
    //函数的本质 -- 编译后，函数会被编译为一个新的方法
    //如果函数名和方法名称相同，那么调用时，默认会调用函数
    test()
  }
  //方法的作用域比较大
  def test():Unit={
    println("test method...")
  }

}
