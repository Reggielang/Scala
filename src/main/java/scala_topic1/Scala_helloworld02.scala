package scala_topic1
/*
Scala语言是基于Java语言的开发
package:java中的包
object：声明一个对象,在编译时，会编译为两个类文件
这个声明的对象的类型：当前类型+$
User user = new User();

Scala_helloworld02:对象名称

def:声明方法的关键字

main：Scala程序入口方法名
():方法参数列表
args: Array[String] 参数
Java=》 String[] arg = Java是一个强类型的语言，在运行前就必须知道类型
Scala=》args: Array[String]

arg:参数名
Array[String] 参数类型
: =>分隔符号

Array[String]：Array是一个数组
Scala语言是一个完全面向对象的语言，所以万物皆对象

: Unit => scala => 名称:类型
                => 参数名：参数类型
                => 变量名：变量类型
                => 方法名：方法的返回类型

          Unit=>表示返回值类型，Unit类型是Scala中新的类型， 为了代替void关键字
          表示没有返回值

= ：赋值

System.out.println("hello world") Java代码

Scala语言基于Java开发，所以大部分的Java代码可以在Scala中直接使用

代码可以不需要分号结尾:scala推荐一行代码中只有一个逻辑，那么分号可以省略



 */
object Scala_helloworld02 {
  def main(args: Array[String]): Unit = {
    //方法体
    System.out.println("hello world")

    println("hello wold")
  }
}
