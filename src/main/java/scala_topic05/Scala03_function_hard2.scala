package scala_topic05

object Scala03_function_hard2 {
  def main(args: Array[String]): Unit = {
    //todo 1.函数也是对象
    val f =()=>{"张三"}

    def fun1():Unit={
      println("fun1...")
    }

    val f2 = fun1 _
    println("**************")
    val f3 = fun1()
    //如果将函数作为整体，而不是执行结果赋值给变量，那么需要采用特殊符号，下划线
    println("**************")
    //f2()


    //万物皆对象，但对象都有类型，意味着函数对象也有类型
    // 函数独立使用时，参数声明没有个数限制，但如果将函数作为对象给别人使用，那么函数的参数声明的个数最多22个
    val f4:Function0[Unit] = fun1 _
    //函数类型还有另外一个写法： （输入参数类型）=> 输出类型

    val f5 :()=>Unit = fun1 _

    def test1(name:String,age:Int):String={
      "123"
    }
    //如果变量声明的类型为函数类型，那么可以不适用下划线让函数作为对象
    val ff :(String,Int)=>String = test1





  }
}
