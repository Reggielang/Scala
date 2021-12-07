package scala_topic09

object Scala07_match {
  def main(args: Array[String]): Unit = {
    //todo 偏函数
    //全量函数：函数进行处理时，必须对所有数据进行处理
    //偏函数：函数进行处理时，只对满足条件的数据进行处理

    val list = List(1,2,3,4)

    // 2 2 6 4
    //map只支持全量函数处理
    val list1 = list.map(
      num=>{
        if(num%2==0){
          num*2
        }
      }
    )

    println(list1)

    //将List(1，2，3，4，5，6，”test“)中的Int类型元素加1，并去掉字符串
    val list2 = List(1,2,3,4,5,6,"test")

    val list3 = list2.map {
      case i: Int => {
        i + 1
      }
      case other => other
    }.filter(_.isInstanceOf[Int])

    println(list3)

    


  }
}
