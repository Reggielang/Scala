package scala_topic06

import test.ScalaUser

object Scala07_object_Instance5 {
  def main(args: Array[String]): Unit = {
    //todo 构造方法私有化 --在参数列表前加入private关键字

    //声明一个公共的，静态的，返回本类型的方法，用于获取对象
    //scala中没有静态语法，但是可以直接使用Java中的静态操作
    //采用了特殊的方式在代替静态语法：object
    //object关键字，可以用于创建对象，对象的名字就是声明的名字
    //使用object关键字声明的类和对象是有关系的
    //这个对象等同于伴随这个类创建时产生的，所以将这个对象称之为，伴生对象
    //这个类称为伴生类
    val person = Person.getInstance()
    println(person)
    //伴生对象就是对象，可以访问伴生类的所有东西，包括私有的

    new ScalaUser().name
    ScalaUser.email
  }
  //伴生类
  class Person private (){
    }
  //伴生对象
  object Person{
    def getInstance():Person={
      new Person()
    }
  }


}

