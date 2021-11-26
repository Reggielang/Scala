package scala_topic04

object Scala01_Flow2 {
  def main(args: Array[String]): Unit = {
    //todo 流程控制 --基本的数据操作流程，从前往后
    //分支判断
    val age= 30
    //表达式的返回结果，表达中满足条件的最后一行代码的执行结果
    val result = if(age==30){
//      println("30")
      "zhangsan"
    }else{
      1
    }
    println(result)
  }

}
