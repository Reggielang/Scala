package scala_topic07

object Scala01_Collection3 {
  def main(args: Array[String]): Unit = {
    //todo 集合
    //多维数组
    var myMatrix = Array.ofDim[Int](3,3)
    myMatrix.foreach(list=> println(list.mkString(",")))

    val arr1 = Array(1,2,3,4)
    val arr2 = Array(5,6,7,8)
    // 合并数组
    val arr3: Array[Int] = Array.concat(arr1, arr2)
    arr3.foreach(println)

    // 创建指定范围的数组
    val arr7: Array[Int] = Array.range(0,2)
    arr7.foreach(println)

    // 创建并填充指定数量的数组
    val arr8:Array[Int] = Array.fill[Int](5)(-1)
    arr8.foreach(println)

  }

}
