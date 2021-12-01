package scala_topic06

object Scala08_object_Trait3 {
  def main(args: Array[String]): Unit = {
    //todo 面向对象 -- 特征
    // 可以将trait理解为接口和抽象类的结合体



  trait Test{
    def test():Unit
  }
  class User extends Test {
    override def test(): Unit = {

    }
    }
  }
}
