package scala_topic05

/*
模板类
 */
object TestTemplateMethodScala {
  def main(args: Array[String]): Unit = {
    TM.execute{
      println("do execute query")
    }

    TM.execute{
      println("do execute insert")
    }
  }

}

object TM{
  def execute(op: => Unit):Unit={
    startTranscation()
    op
    endTranscation()

  }

  private def startTranscation():Unit={
    println(("startTranscation"))
  }

  private def endTranscation():Unit={
    println(("endTranscation"))
  }
}
