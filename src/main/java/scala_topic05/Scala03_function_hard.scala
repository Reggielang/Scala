package scala_topic05

object Scala03_function_hard {
  def main(args: Array[String]): Unit = {
  }

  //todo 1.return 关键字可以省略
  def test(): String = {
    "lisi"
  }

  println(test())

  //todo 2.如果函数返回数据，那么可以推断出返回值类型的话，返回值类型可以省略
  def test2(): String = {
    "wangwu"
  }

  println(test2())


  def test22(): Any = {
    val age = 30
    if (age == 30) {
      "张三"
    } else {
      null
    }
  }

  println(test22())

  //todo 3.如果函数体的逻辑代码只有一行的，那么大括号可以省略
  def test3(): String = "wangwu1"

  println(test3())

  //todo 4.如果函数的参数列表中没有声明任何的参数，那么参数列表可以省略
  def test4 = "wangwu2"
  //当函数省略参数列表的声明时，调用这个函数不能增加小括号
  println(test4)

  //todo 5.如果函数声明为Unit，那么函数体中的return关键字不会返回任何值,那么可以将等号同时省略
  def test5:Unit={
    return "zhangsan"
  }
  //如果函数体使用了return返回结果，那么一定要声明返回值类型
//  def test55:={
//    return "zhangsan"
//  }
  //过程函数
  def test555 {
    return "zhangsan"
  }
  println(test5)

  //todo 6.关键字def和函数名也可以省略，称为匿名函数
  println(List(1,2,3,4).reduce(_-_))
  //省略的同时，也需要把返回值类型省略，将等号增加一个箭头
  //匿名函数不能单独使用
  ()=>{"张三"}
}
