package scala_topic06

import java.util

object Scala03_object_class {
  def main(args: Array[String]): Unit = {
    //todo -面向对象编程 --class 使用关键字声明类
    // 通过new的方式构建类的对象
    // scala中的源码可以声明多个类，而且可以声明多个公共类，名称可以和文件名不一样
    val test = new Test()
  }
  class Test{}
}

