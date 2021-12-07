package scala_topic09

object Scala08_match {
  def main(args: Array[String]): Unit = {
    //todo 偏函数
    //将List(1，2，3，4，5，6，”test“)中的Int类型元素加1，并去掉字符串
    val list = List(1,2,3,4,5,6,"test")

    //偏函数，只对满足条件的数据进行处理，不满足的数据直接删除
    val list1 = list.collect {
      case i: Int => i + 1
    }

    println(list1)

    


  }
}
