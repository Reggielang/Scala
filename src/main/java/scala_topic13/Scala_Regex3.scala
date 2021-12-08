package scala_topic13

object Scala_Regex3 {
  def main(args: Array[String]): Unit = {
    //todo 正则表达式
    def main(args: Array[String]): Unit = {
      // 构建正则表达式
      val r = """([_A-Za-z0-9-]+(?:\.[_A-Za-z0-9-\+]+)*)(@[A-Za-z0-9-]+(?:\.[A-Za-z0-9-]+)*(?:\.[A-Za-z]{2,})) ?""".r
      println(r.replaceAllIn("abc.edf+jianli@gmail.com   hello@gmail.com.cn", (m => "*****" + m.group(2))))
    }

  }
}