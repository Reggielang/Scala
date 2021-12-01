package scala_topic06

import scala.beans.BeanProperty

object Scala04_object_Field {
  def main(args: Array[String]): Unit = {
    //todo -面向对象编程 --class -属性 --类中的变量就是属性
    //在编译时，编译器回将变量编译为类的（私有属性），同时提供了属性对应的set,get方法
    val test = new Test()
    println(test.name)

    //使用val声明的变量，取值不能改变
//    test.age=10

    // java bean规范
    // 反射一般用于架构设计，而架构设计的目的就是通用化
    // scala中给属性提供的set，get方法不遵循bean规范
    test.setSex("xxx")
    println(test.getSex())

  }
  class Test{
    //声明属性
    //private String name = "zhangsan"
    //private final Int age = 20
    var name = "zhangsan"
    val age = 20
    var email :String = _//如果希望类的属性和Java一样可以由系统进行初始化，而不是手动赋值，可以采用特殊符号，下划线

    @BeanProperty var sex :String = _
  }
}

