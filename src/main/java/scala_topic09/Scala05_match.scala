package scala_topic09

object Scala05_match {
  def main(args: Array[String]): Unit = {
    //todo

    val user = getUser()



    user match {
      case User("zhangsan",30)=> println("用户是张三哦")
      case _=> println("什么都不是")
    }

  }
  class User{
    var name: String = _
    var age: Int = _
}

  object User{
    //apply:Attribute=>Object
    def apply(name: String, age: Int) = {
      val user = new User()
      user.name = name
      user.age = age
      user
      }
    //unapply:Object=>Attribute 用对象得到他的属性
    def unapply(user: User): Option[(String,Int)] = {
      Option((user.name,user.age))

    }
  }
  def getUser()={
    User("zhangsan",30)
  }



}
