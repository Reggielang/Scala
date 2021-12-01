package scala_topic06

object Scala08_object_Trait5 {
  def main(args: Array[String]): Unit = {
    //todo 面向对象 -- 特征
    //Java不能类的多继承，砖石问题？ D继承了A，B D.test -到底是使用A.test方法，还是B.test方法？
    //scala采用了一种功能叠加方式解决钻石问题
    //super不是父特质的意思，而是上一级的意思
    new MySql().operData()
  }
  trait Operator{
    def operData():Unit={
      println("操作数据")
    }
  }
  trait DB extends Operator {
    override def operData(): Unit = {
      println("向数据库中")
      super.operData()
    }
  }

  trait Log extends Operator{
    override def operData(): Unit = {
      println("向日志文件中")
      super[Operator].operData()
//      super[Operator].operData() //可以跳过DB
    }
  }
  class MySql extends DB with Log{
  }
}
