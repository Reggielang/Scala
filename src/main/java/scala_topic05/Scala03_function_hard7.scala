package scala_topic05

object Scala03_function_hard7 {
  def main(args: Array[String]): Unit = {
    //todo 3.函数作为返回值
    // todo 一个函数使用了外部的变量，把这个变量包含到内部来使用，改变了这个变量的生命周期
    //将当前的代码形成了闭合的环境-- 闭包
    // 2.12版本前闭包采用匿名函数类实现
    //2.12版本后闭包采用改变函数声明来实现
    //内部函数在外部使用的时候会有闭包
    def outer(a:Int)={
      def inner(b:Int):Int={
        a+b
      }
      inner _
    }

    //println(outer(10)(20))
      val f = outer(10)
      val ff = f(20)
      println(ff)

  }
}
