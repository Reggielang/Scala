package scala_topic04

object Scala01_Flow {
  def main(args: Array[String]): Unit = {
    //todo 流程控制 --基本的数据操作流程，从前往后
    //分支判断
    val age= 30
//    if(age==30){
//      print("年龄等于30")
//    }else{
//      print("其他")
//    }
    if(age<18){
      print("少年")
    }else if(age<36){
      print("青年")
    }else if (age<45){
      print("青壮年")
    }else if (age<55){
      print("中年")
    }else{
      print("老年")
    }

  }

}
