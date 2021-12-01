package scala_topic06

object Scala08_object_Abstract4 {
  def main(args: Array[String]): Unit = {
    //todo 面向对象 -- 属性
    //子类可以重写父类的抽象属性，补充完整即可
    //子类可以重写父类的完整属性，那么必须要添加override关键字
    val user = new Child()
    println(new Child().age)
  }

  abstract class User{
    var name:String
    val age:Int=10

    def test():Unit={
      //age =30 //对属性的赋值，等同于调用属性的set方法
      println(age) //对属性的访问，等同于调用属性的get方法
    }
  }
  class Child extends User{
    var name:String="zhangsan" //重写
    override val age:Int=20
  }
}

