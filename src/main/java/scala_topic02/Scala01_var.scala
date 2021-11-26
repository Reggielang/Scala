package scala_topic02

object Scala01_var {
  def main(args: Array[String]): Unit = {
    //todo 变量
    //java中变量声明 => String name = "zhangsan";
    //scala中变量声明 => var 变量名：变量的类型 = 变量值
    //可变变量
    var name1:String = "zhangsan"
    name1="sichuan"
    print(name1)

    //不可变变量
    //val 创建一个变量，一旦初始化不能重新赋值
    val name2:String = "lisi"
    print(name2)

    //强类型语言中，类型的声明应该前后统一，如果我明确的知道变量的取值是多少，那么变量的类型就确定了
    //能够通过变量值推断变量类型可以不用写变量类型
    // 如果要使用多态就不能省
    var name3="wangwu"
    print(name3)
  }
}
