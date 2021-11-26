package scala_topic05

object Scala01_function_method {
  def main(args: Array[String]): Unit = {
    //todo 函数式编程 --在类中声明的函数称之为方法，其他场合称为函数

    //函数没有重载或重写，但可以嵌套使用
    //函数的作用域比较窄
    def test():Unit={
      println("test function...")
      def test1():Unit={

      }
    }
  }
  //方法的作用域比较大
  def test():Unit={
    println("test method...")
  }
  def test(name:String):Unit={
    println("test method...")
  }

}
