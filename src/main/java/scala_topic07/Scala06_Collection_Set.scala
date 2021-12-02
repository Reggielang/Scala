package scala_topic07

import scala.collection.mutable


object Scala06_Collection_Set {
  def main(args: Array[String]): Unit = {
    //todo 集合-Set

    //数据无序(插入的无序)，不可以重复
    //不可变set
//    val set = Set(1,2,3,4,5,6,7,8,3,4,5)

    //可变set
    val set = mutable.Set(1,2,3,4,5,1,2,3,4)

    val bool = set.add(5)

    println(set)

    //update用于更新set集合，有就删除，没有就加入数据
    set.update(4,true)
    println(set)

    set.update(4,false)
    println(set)

    set.remove(3)



    





  }

}
