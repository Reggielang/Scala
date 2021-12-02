package scala_topic07

object Scala05_Collection_Seq {
  def main(args: Array[String]): Unit = {
    //todo 集合-Seq
    //一般采用list
    val seq= Seq(1,2,3,4)
    val list= List(5,6,7,8)

    println(seq)
    println(list)

    //数据操作
    val ints = list :+ 5
    val ints1 = 5 +: list

    //Nil 在集合中表示空集合

    val ints2 = 1::2::3::Nil
    val list1 = 1 :: 2 :: 3 :: list ::: Nil //：：：把整体拆分成个体

    println(ints2)

    println(list1)


  }

}
