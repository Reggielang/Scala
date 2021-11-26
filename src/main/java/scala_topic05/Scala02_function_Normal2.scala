package scala_topic05

object Scala02_function_Normal2 {
  def main(args: Array[String]): Unit = {
    //todo 3.参数默认值 --声明参数的同时的默认值(底层就是一个封装了的方法，返回这个默认值)
    def fun3(passwd:String="23456"):Unit={
      println(passwd)
    }
    fun3()
    fun3("1123123")
  }
}
