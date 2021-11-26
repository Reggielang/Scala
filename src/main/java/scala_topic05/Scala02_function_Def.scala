package scala_topic05

object Scala02_function_Def {
  def main(args: Array[String]): Unit = {
    //todo 无参，无返回值
    def fun1():Unit={
    println("fun1...")}
    fun1//如果函数声明无参数，那么调用时就可以省略括号

    //todo 无参，有返回值
    def fun2():String={
      return "fun 2 ...张三"
    }

    val str = fun2()
    println(str)

    //todo 有参，无返回值 参数的声明方式 ： 参数名:参数类型
    def fun3(name:String):Unit={
    println("name: "+name)}
    //当函数有参数，调用时应该传递相同类型参数
    fun3("fun3...zhangsan")

    //todo 有参，有返回值
    def fun4(name:String):String = {
    return "fun4...name "+name
  }
    val result4 = fun4("lisi")
    println(result4)

    //todo 多参，无返回值
    def fun5(name:String,age:Int):Unit={
    println(s"name : ${name}, age : ${age}")
    }
    fun5("fun5... wangwu",50)

    //todo 多参，有返回值
    def fun6(name:String,age:Int):String={
    return s"name :${name}, age :${age}"
  }

    val result6 = fun6("fun6... xiaoliu", 60)
    println(result6)


  }
}
