package scala_topic05

object Scala02_function_Normal3 {
  def main(args: Array[String]): Unit = {
    //todo 4.带名参数 --传递参数时，增加参数的名称，用于改变传参的顺序
    def fun4(passwd:String="00000",name:String):Unit={

    }
    //参数传递时，默认为顺序匹配
    //scala可以改变传值的顺序
    fun4(name="zhangsan")
  }
}
