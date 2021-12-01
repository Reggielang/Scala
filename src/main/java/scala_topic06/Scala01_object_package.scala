package scala_topic06

object Scala01_object_package {
  def main(args: Array[String]): Unit = {
    //todo -面向对象编程 --包
    /*
    java package:分类管理，区分类

    scala package:
    1.起名，可以多次使用package关键字
    2.源码的路径和包名没有关系
    3.明确包的作用域，可以在package关键字后加大括号
    4.同一个源码中，子包可以直接访问父包中的内容
    5.scala可以把包当作对象来用
    可以直接声明对象和方法
     */
    testPackageObject()

    
  }
}
