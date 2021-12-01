package scala_topic06

object Scala08_object_Abstract2 {
  def main(args: Array[String]): Unit = {
    //todo 面向对象 -- 抽象属性 (底层实现其实就是抽象方法)
    val user = new Child()
  }

  abstract class User{
    //抽象属性只有声明没有初始化--编译时会声明属性的set，get抽象方法
    var name:String
  }
  class Child extends User{
    //声明了私有属性，同时提供了set，get方法，并且为公共的
    var name:String="zhangsan"
  }
}

