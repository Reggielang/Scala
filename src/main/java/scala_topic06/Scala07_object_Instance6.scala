package scala_topic06

import test.ScalaUser

object Scala07_object_Instance6 {
  def main(args: Array[String]): Unit = {
    //todo 单例 -scala中伴生对象就是单例的
    //伴生对象，只需要声明即可，无需构建，所以不需要构造参数列表
    //单例模式存在问题：创建的对象不会被回收，需要显示回收 设置为null
    //如果伴生对象中构建对象的方法名为apply，那么编译器自动识别，方法名可以省略
    val test1=new Test() //调用类的构造方法
    val test2=Test()  //调用的是伴生对象的apply方法
    val test3 =Test //伴生对象本体


    
  }

  class Test {
    println("tttttttt")
  }
  object Test{
//    def getInstance():Test={
//      new Test()
//    }
    def apply():Test={
      println("apply")
      new Test()
    }
  }
}

