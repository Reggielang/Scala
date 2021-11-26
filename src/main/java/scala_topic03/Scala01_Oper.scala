package scala_topic03

/*
运算符
 */
object Scala01_Oper {
  def main(args: Array[String]): Unit = {

    //todo 运算符
    val s1= new String("abc")
    val s2= new String("abc")

    //判断对象是否相等，在Java中是判断内存
    //scala语法中就是比较对象的内容，但是和equals不一样 是非空的equals操作
    println(s1==s2)
    println(s1.equals(s2))

    //如要比较内存地址使用eq
    println(s1.eq(s2))

    val s =  "abc"*2
    println(s)
  }
}
