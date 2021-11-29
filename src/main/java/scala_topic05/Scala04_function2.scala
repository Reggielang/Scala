package scala_topic05

object Scala04_function2 {
  def main(args: Array[String]): Unit = {
    //todo 函数柯里化
    val a = 10
    val b = 20
    //将无关的参数分离开
    def test(a:Int,b:Int):Unit={
      for(i<- 1 to a){
        println(i)
      }
      for(j<- 1 to b){
        println(j)
      }
    }

    test(a,b)


    def test1(a:Int)(b:Int):Unit={
      for(i<- 1 to a){
        println(i)
      }
      for(j<- 1 to b){
        println(j)
      }
    }

    test1(a)(b)

  }
}
