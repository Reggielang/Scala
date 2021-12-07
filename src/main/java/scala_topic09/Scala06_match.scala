package scala_topic09

object Scala06_match {
  def main(args: Array[String]): Unit = {
    //todo  样例类

    val user = getUser()



    user match {
      case User("zhangsan",30)=> println("用户是张三哦")
      case _=> println("什么都不是")
    }

  }
  //如果在类的前面加case关键字，这个类就专门就用于模式匹配
  //在编译时会自动生成大量的方法
 case class User(name:String,age:Int){}

  def getUser()={
    User("zhangsan",30)
  }



}
