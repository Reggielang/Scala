package scala_topic07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection7 {
  def main(args: Array[String]): Unit = {
    //todo 集合-方法
    val array= ArrayBuffer(1,2,3,4)
    //filter 可以对集合中的每一条数据进行筛选过滤
    //满足条件的数据保留，部满足条件的数据丢弃
    val r = array.filter(
      num => {
        num%2!=0 //true
      }
    )

    println(r)



  }

}
