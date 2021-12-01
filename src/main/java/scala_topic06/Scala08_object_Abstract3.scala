package scala_topic06

object Scala08_object_Abstract3 {
  def main(args: Array[String]): Unit = {
    //todo 面向对象
    //子类重写父类的抽象方法，直接补充完整即可
    //子类重写父类的完整方法，必须添加override关键字
    //开发时，推荐只要重写，都添加override
    val user = new Child()
  }

  abstract class User{
    def test():Unit={

    }
    def fun():Unit
  }
  class Child extends User{
    override def test(): Unit = {

    }

    override def fun(): Unit= {

    }
  }
}

