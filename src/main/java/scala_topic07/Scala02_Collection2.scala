package scala_topic07

import java.util
import scala.collection.mutable.ArrayBuffer

object Scala02_Collection2 {
  def main(args: Array[String]): Unit = {

    //不可变=》可变
    val array = Array(1,2,3,4)
    val buffer = array.toBuffer

    //可变=》不可变
    val buff = ArrayBuffer(5,6,7,8)
    val array1 = buff.toArray

    //java 集合《=》Scala集合
    import scala.collection.JavaConverters._
//    val list = new util.ArrayList()
//    list.asScala.foreach(println)

  }

}
