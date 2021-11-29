package scala_topic05

object Scala03_function_hard4 {
  def main(args: Array[String]): Unit = {
    //todo 2.函数作为参数
    def test (f:(String)=>Unit):Unit={
      f("张三")
    }

    def fun(name:String):Unit={
      println(name)
    }

    test(fun)

    test((name:String)=>{println(name)})

    test((name:String)=>println(name))

    test((name)=>println(name))

    test(println(_)) //匿名函数的至简原则最小版
  }
}
