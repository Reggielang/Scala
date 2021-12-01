package scala_topic06

import scala.beans.BeanProperty

object Scala05_object_Access {
  def main(args: Array[String]): Unit = {
    //todo -面向对象编程 --访问权限
    /*
    1.java
    private=>本类
    default=>本类本包
    protected=>本类，本包，子类
    public =>任意

    2.scala
    private=>同类
    private[包名]=>同包，包私有
    protected=>受保护的，同类，子类
    (default)=>什么都不写就是公用的
     */
  }

  class Test6 {
    private val name1: String = "11111"
    private[scala_topic06] val name2: String = "222222"
    protected val name3: String = "33333"
    val name4: String = "44444"


    def test6(): Unit = {
      println(name1)
      println(name2)
      println(name3)
      println(name4)
    }

  }
  class Test66 {
    def test6(): Unit = {
      val t = new Test6
//      println(t.name1)
//      println(t.name2)
//      println(t.name3)
//      println(t.name4)
    }

  }
}

