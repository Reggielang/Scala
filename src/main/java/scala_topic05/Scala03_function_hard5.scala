package scala_topic05

object Scala03_function_hard5 {
  def main(args: Array[String]): Unit = {
    //todo 2.函数作为参数
    def test (f:(Int,Int)=>Int):Int={
      f(10,20)
    }

    test((x:Int,y:Int)=>{x+y})

    test((x:Int,y:Int)=>x+y)

    test((x,y)=>x+y)

    test(_+_)


  }
}
