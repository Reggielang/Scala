package scala_topic07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection3 {
  def main(args: Array[String]): Unit = {
    //todo 集合-方法
    val array= ArrayBuffer(1,2,1,4)
    println(array.sum)
    println(array.max)
    //乘积
    println(array.product)


    //自定义数据操作方法
    //原则：集合的数据无论是多少，最基本的数据操作都是两两计算
    //reduce =>简化，规约（聚合）

    def runduceFuncation(x:Int,y:Int):Int={
      x+y
    }

//    println(array.reduce((x:Int,y:Int)=>{x+y}))
//    println(array.reduce((x:Int,y:Int)=>x+y))
//    println(array.reduce((x,y)=>x+y))
    println(array.reduce(_+_))



  }

}
