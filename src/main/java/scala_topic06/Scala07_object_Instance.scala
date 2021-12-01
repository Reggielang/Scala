package scala_topic06

import test.User

object Scala07_object_Instance {
  def main(args: Array[String]): Unit = {
  //todo 类-对象


    //Java构造方法：提供无参，公共的构造方法
    //2.构造方法重载的
    //3.构造方法可以互相调用
    //4.必须要显式调用父类有参的构造方法
    //5.构造方法的名称应该和类型一致

    //scala中的构造方法
    //1.提供无参，公共的构造方法
    //2.构造方法的名称和类名，不一致的
    //3.所以类也是一个函数，声明一个类等于声明一个函数
    //类名的后面可以声明小括号，表示构造参数列表
    val user = new User()


  }
  class User(){
    //类的初始化
    //构造方法体&类的主体内容
    val name:String ="zhangsan"
    //名字相同只是普通的方法
    def user():Unit={
      println("xxxxx")
    }
  }
}

