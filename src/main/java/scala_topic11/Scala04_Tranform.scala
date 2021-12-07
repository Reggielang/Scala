package scala_topic11

import scala_topic09.Scala05_match.User

object Scala04_Tranform {
  def main(args: Array[String]): Unit = {
    //todo 隐式类

    //scala中可以将implicit关键字声明在类的前面，称为隐式类
    //不能为顶级对象
    val user =new  User()
    user.insertUser()
    user.updateUser()

  }
  implicit class UserExt(user: User){
    def updateUser():Unit={
      println("update user...")
    }
  }

  class User{
    def insertUser():Unit={
      println("insert user...")
    }
  }
}
