package scala_topic07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection8 {
  def main(args: Array[String]): Unit = {
    //todo 集合-方法
    val array= ArrayBuffer(1,2,3,4)
    //groupBy-根据指定的规则对每条数据进行分组
//    val map = array.groupBy(
//      num => {
//        if (num % 2 == 0) {
//          "偶数"
//        } else {
//          "奇数"
//        }
//      }
//    )
//    println(map)

    //H为一组，S为一组
    val array2 = ArrayBuffer("Hello","Scala","Hello","Spark")
    println(array2.groupBy(_.substring(0, 1)))
    //根据单个词分组
    println(array2.groupBy(word=>word))

  }

}
