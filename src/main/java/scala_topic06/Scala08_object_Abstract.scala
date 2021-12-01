package scala_topic06

object Scala08_object_Abstract {
  def main(args: Array[String]): Unit = {
    //todo 面向对象 -- 抽象
    //所谓的抽象其实不完整类
    //抽象类和抽象方法
    //抽象类，不能直接实例化--由子类继承后实例化
    //scala中不完整的方法就是抽象的，所以无需加abstract关键字
    val user = new Child()
  }

  abstract class User{
    //抽象方法：只有声明没有实现
    def test():Unit
  }
  class Child extends User{
    override def test(): Unit = {

    }
  }
}

