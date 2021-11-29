package scala_topic05

object Scala03_function_hard3 {
  def main(args: Array[String]): Unit = {
    //todo 2.函数作为参数
    def test(f:()=>Unit):Unit={
      f()
    }
    //函数对象
    def fun1():Unit={
      println("xxxx")
    }
    test(fun1)

    def test1(f:(Int,Int)=>Int):Unit={
      val r = f(10,20)
      println(r)
    }

    def fun2(x:Int,y:Int):Int={
      x+y
    }
    def fun3(x:Int,y:Int):Int={
      x-y
    }

    def fun4(x:Int,y:Int):Int={
      x-y
    }
    //test1(fun2)
    //test1(fun3)

    test1((x:Int,y:Int)=>{x+y})

    //todo 匿名函数在使用时也可以存在至简原则
    //1.如果函数的逻辑代码只有一行，大括号可以省略，代码写在一行中
    test1((x:Int,y:Int)=>x+y)
    //2.如果参数的类型可以推断出来，那么参数类型可以省略
    test1((x,y)=>x+y)
    //3.如果参数只有一个的话，参数列表的小括号也可以省略
    //4.如果参数在使用时，按照顺序只使用了一次，那么可以使用下划线代替参数
    test1(_+_)

  }
}
