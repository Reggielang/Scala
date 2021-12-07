package scala_topic09

object Scala02_match {
  def main(args: Array[String]): Unit = {
    //todo 模式匹配 --匹配常量
//    def describe(x: Any) = x match {
//      case 5 => "Int five"
//      case "hello" => "String hello"
//      case true => "Boolean true"
//      case '+' => "Char +"
//    }
//
//    println(describe(5))
    //匹配类型 类型前增加变量名称,这个变量就是将数据转换为指定类型的变量
    //scala中，类型匹配时不考虑泛型的
    def describe(x: Any) = x match {
      case i: Int => "Int" //i+10
      case s: String => "String hello"
      case m: List[_] => "List"
      case c: Array[Int] => "Array[Int]" //Array中的Int不是真的泛型
      case someThing => "something else " + someThing
    }

    println(describe("123"))


  }
}
