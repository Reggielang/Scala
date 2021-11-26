package scala_topic04

object Scala02_For {
  def main(args: Array[String]): Unit = {
      //todo for循环
    /*
    java
    for (int i=0,i<10;i++){
        sout(i)
    }

    for(Object obj: list){
      sout(i)
    }
     */

    //val range = 1.(to5)
    //val range = 1 (to5)
//    val range = 1 to 5 by 2 步长2
//    val range = 1 until 5 by 2
    val range = Range(1,5,2) //不包含末尾
    //scala
    for(i <- range){
      println(i)
    }

    for(i<-Range(5,1,-1)){
      println(i)
    }

  }

}
