package scala_topic07

object Scala01_Collection2 {
  def main(args: Array[String]): Unit = {
    //todo 构建--使用集合的伴生对象构建集合同时初始化
    //scala集合分为两大类，可变集合，不可变集合
    //scala中提供的集合都是不可变的
//    val array = new Array[Int](3)
    val array1 = Array(1,2,3,4)
    val array2 = Array(6,7,8,9)

    //访问--可以根据索引访问数组的元素
    //scala中运算符是以冒号结尾，那么运算规则从后向前计算
//    val ints = array1.+:(5)
    val ints = 5+:array1
//    val ints1 = array1.:+(5)
    val ints1 = array1:+5
//    println(ints eq ints1)
    val ints2 = array1 ++ array2



    //遍历
    println(ints.mkString(","))
    println(ints1.mkString(","))
    println(ints2.mkString(","))

    //循环函数 --需要传递一个参数，参数类型是函数类型 Int=>U
//    def foreachFuncation(num:Int):Unit={
//      println(num)
//    }
//    ints.foreach((num:Int)=>{println(num)})
//    ints.foreach((num:Int)=>println(num))
//    ints.foreach(num=>println(num))
    ints.foreach(println(_))
  }

}
