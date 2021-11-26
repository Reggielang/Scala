package scala_topic05

object Scala02_function_Normal {
  def main(args: Array[String]): Unit = {
    //todo 1.多参的个数 --没有限制的
    def fun1(a1:Int):Unit={
    }
    // todo 可变参数 --类型后面*， 参数个数没有限制 可变参数在使用时都是集合对象
    // 可变参数跟Java一样必须在参数列表最后！
    def fun2(name:String*):Unit={
      println("function2...")
    }

    fun2() //List()
    fun2("lixi")//WrappedArray(lixi)

  }
}
