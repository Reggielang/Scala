package scala_topic11

import scala_topic11.Scala05_Tranform.User

object Scala05_Tranform extends Partent with MyTrait {
  def main(args: Array[String]): Unit = {
    //todo 隐式转换的范围：
    //todo 1.当前代码作用域
    //todo 2.父类或伴生对象
    //todo 3.特征或伴生对象
    //todo 4.在其他地方声明(包对象)
    //todo 5.直接导入
    //scala中可以将implicit关键字声明在类的前面，称为隐式类
    //不能为顶级对象
    val user =new  User()
    user.insertUser()
    user.updateUser()

  }
//  implicit class UserExt(user: User){
//    def updateUser():Unit={
//      println("update user...")
//    }
//  }

  class User{
    def insertUser():Unit={
      println("insert user...")
    }
  }
}

class Partent{
//  implicit class UserExt(user: User){
//    def updateUser():Unit={
//      println("update user...")
//    }
//  }
}

object Partent{
//  implicit class UserExt(user: User){
//    def updateUser():Unit={
//      println("update user...")
//    }
//  }
}

trait MyTrait{
//  implicit class UserExt(user: User){
//    def updateUser():Unit={
//      println("update user...")
//    }
//  }
}
object MyTrait{
//  implicit class UserExt(user: User){
//    def updateUser():Unit={
//      println("update user...")
//    }
//  }
}