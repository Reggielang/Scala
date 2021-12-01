package scala_topic06

object Scala08_object_Trait2 {
  def main(args: Array[String]): Unit = {
    //todo 面向对象 -- 动态混入功能
    val user = new User() with Updateuser
    user.inserUser()
    user.updateuser()
    }

  trait Updateuser{
    def updateuser():Unit={
      println("update user...")
    }
  }
  class User{
    def inserUser():Unit={
      println("insert user ...")
    }


  }
}
