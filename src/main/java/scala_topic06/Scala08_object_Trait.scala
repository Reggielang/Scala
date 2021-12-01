package scala_topic06

object Scala08_object_Trait {
  def main(args: Array[String]): Unit = {
    //todo 面向对象 -- 特征-将多个对象中相同的特征，从对象中抽取出来，形成独立的一个结构，称为特征
    //如果一个对象符合这个特质，那么可以将这个特征加入到这个对象中，这个加入的过程称之为混入
    //如果一个类只有一个特征时，采用extends关键字混入
    //但是一个类由多个特征时，第一个用extends，后续用with

    //如果类存在父类的场合，并同时具备了某个特征
    //需要用extends关键字继承父类，使用with关键字混入特征

    }
  trait eat{
    def eat():Unit
  }
  trait Runnable{
    def run():Unit
  }
  class Person extends Runnable with eat {
    override def run(): Unit = {
      println("run...")
    }

    override def eat(): Unit = {
      println("eat")
    }
  }

  class Dog extends Runnable {
    override def run(): Unit = {
      println("run...")
    }
  }

}
