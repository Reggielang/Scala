package scala_topic13

object Scala_Regex {
  def main(args: Array[String]): Unit = {
    //todo 正则表达式
    // 模式匹配匹配的规则： 类型，常量，元组，集合，数组，对象，参数

    //1.声明规则
    val regex = "a".r

    //2.准备数据
    val data = "zhangsan"

    //3.使用规则校验数据
    val maybeString = regex.findFirstIn(data)

    if (maybeString.isEmpty){
      println("字符串不符合规则")
    }else{
      println("字符串符合规则" + maybeString.get)
    }
  }

}
