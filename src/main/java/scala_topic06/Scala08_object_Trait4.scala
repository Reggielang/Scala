package scala_topic06

object Scala08_object_Trait4 {
  def main(args: Array[String]): Unit = {
    //todo 面向对象 -- 特征
    // 初始化问题 -- 父类的特质 > 父类 > 特质 > 当前类
    new User()


  trait Test{
    println("aaaa")

  }
    trait Test1{
      println("dddddd")

    }
  class Person{
    println("bbbbb")
  }
  class User extends Person with Test with Test1 {
    println("ccccc")

    }
  }
}
