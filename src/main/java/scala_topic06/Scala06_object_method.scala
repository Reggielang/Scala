package scala_topic06

object Scala06_object_method {
  def main(args: Array[String]): Unit = {
    //todo -面向对象编程 --method
    //所谓方法， 就是类中声明的函数，属于类的一部分
    val t1 = new Test7()
    val t2 = new Test7()
    println(t1 == t2)
    //常用方法 -- java.lang中的类，不需要import显式导入的
    println()
    val value:Class[Test7] = classOf[Test7] //Test7.class

  }
  class Test7{
    val id :Int = 1

    override def equals(o: Any): Boolean = {
        //todo 1.类型相同
      if(o.isInstanceOf[Test7]){
        //todo 2.将判断的对象转换为当前类型
        val other = o.asInstanceOf[Test7]
        this.id == other.id
      }else{
        false
      }
    }
  }

}

