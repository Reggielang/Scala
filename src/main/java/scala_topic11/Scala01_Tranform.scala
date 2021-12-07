package scala_topic11

object Scala01_Tranform {
  def main(args: Array[String]): Unit = {
    //todo 隐式转换
    val b:Byte=10
    val i:Int=b;

    //如果程序编译出错，编译器会尝试在整个作用域中查找能够让程序编译通过的方式
    //如果找到，那么编译器会尝试二次编译，让之前编译出错的编码，经过转换后，能够编译通过
    //所谓的隐式转换其实就是类型的转换
    val age :Int=thirdPart()
    println(age)

  }
  implicit def tranform(d:Double):Int={
    d.toInt
  }
  def thirdPart():Double={
    30.0
  }
}
