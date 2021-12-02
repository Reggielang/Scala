package scala_topic07

import scala.collection.mutable.ArrayBuffer

object Scala03_Collection9 {
  def main(args: Array[String]): Unit = {
    //todo 集合-方法
    val array= ArrayBuffer(1,4,3,2)
    //排序:通过指定的规则对每一条数据进行排序,默认为升序
    println(array.sortBy(
      num => num
    ))

    val array2= ArrayBuffer("1","11","2","3","22")
    println(array2.sortBy(
//      num => num 根据字符串字典顺序排序
      num => num.toInt
    ))
    //降序排序
    println(array2.sortBy(num => num.toInt)(Ordering.Int.reverse))
  }

}
