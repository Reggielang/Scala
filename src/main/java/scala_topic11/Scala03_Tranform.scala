package scala_topic11

object Scala03_Tranform {
  def main(args: Array[String]): Unit = {
    //todo 隐式参数

    def reg(implicit passwd:String="000000"):Unit={
      println("默认密码"+passwd)
    }


    //隐式变量 --在同一个作用域中，如果有相同的转换的多个数据，会发生错误。
    implicit val passwd:String="111111"
//    implicit val paswd:String="222222"
    reg
    reg()
    reg("123123")
  }
}
