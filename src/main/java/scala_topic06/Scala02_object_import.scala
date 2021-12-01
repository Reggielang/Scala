package scala_topic06
import java.util
import java.util._
object Scala02_object_import {
  def main(args: Array[String]): Unit = {
    //todo -面向对象编程 --导入
    // java:1.导入其他包的类
    // 2.静态导入






     //todo  scala import:
    // 1.java import 的功能基本单一
    // 2.星号有特殊用途，不能使用在import语法中,需要采用下划线代替星号
    // 3.import 关键字可以在任何的地方中使用
//    import java.util.Date
//    new Date();
    // 4.可以在一行中导入同一个包的多个类
    // 5.导包
    // 6.隐藏类
    import  java.util._
    import  java.sql.{Date=>_,_}
    new Date()//用的时util下的Date
    new util.ArrayList()

    // 7.scala中导入类的操作，是以相对路径（当前包路径）的方式导入的
    // 如果想要使用绝对路径的方式，那么需要增加特殊操作：_root_
    println(new _root_.java.util.HashMap())

    // 8.可以给类起别名
    import java.util.{HashMap=>javaHashMap}
    println(new javaHashMap())


  }
}
//package java{
//  package util{
//    class HashMap{
//
//    }
//  }
//}
