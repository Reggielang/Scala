package scala_topic09

object Scala01_match {
  def main(args: Array[String]): Unit = {
    //todo 模式匹配 --匹配规则
    //scala语言中没有switch语法
    //当数据某一个分支时，会直接跳出
    //如果数据没有匹配任何规则就会发生错误
    val age=10;
    age match {
      case 10=>
        println("age=10")
      case 30=>
        println("age=30")
      case _=>
        println("other")
    }

    var a: Int = 10
    var b: Int = 20
    var operator: Char = 'd'
    var result = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal"
    }
    println(result)
  }
}
