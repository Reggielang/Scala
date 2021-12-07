package scala_topic11

object Scala02_Tranform {
  def main(args: Array[String]): Unit = {

    implicit def tranform(user: User):UserExt={
      new UserExt()
    }
    //todo 隐式转换
    //使用implicit声明的函数为隐式函数
    val user = getUser()
    user.insertUser()
    user.updateUser()





  }

  class UserExt{
    def updateUser():Unit={
      println("update user...")
    }
  }
  class User{
    def insertUser():Unit={
      println("insert user...")
    }


  }

  def getUser():User={
    new User
  }


}
