package scala_topic07

object Scala01_Collection {
  def main(args: Array[String]): Unit = {
    //todo 集合
    //数组 严格意义上数组不是集合，Scala中给数组一个特定的类型，Array
    //todo 构建
    //String[] --java
    //scala中构建数组，等同于构建Java的数组
    val array = new Array[String](3)

    //访问--可以根据索引访问数组的元素
    //array.update(0,"abc")
    //中括号在Scala中表示泛型，不能在索引操作中使用，使用小括号即可
    array(1)="abc"

    //遍历
    for (elem <- array) {
      println(elem)
    }
  }

}
