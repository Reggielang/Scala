package scala_topic04

object Scala02_For2 {
  def main(args: Array[String]): Unit = {
      //todo for循环
    // 循环守卫
    for(i <- Range(1,5) if i!=3){
      println("i = " +i)
    }


    //todo 循环嵌套
    for ( i <- Range(1,3); j <- Range(1,3) ) {
      println("i = " + i + ",j = " + j )
    }
    //建议使用下面
    println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$")
    for ( i <- Range(1,3) ) {
      for ( j <- Range(1,3) ) {
        println("i = " + i + ",j = " + j )
      }
    }
    //todo 引入变量
    for(i<-Range(1,5); j =i - 1){
      println("j ="+j)
    }

    for(i<-Range(1,10)){
    }

  }

}
