package scala_topic04

object Scala03_While {
  def main(args: Array[String]): Unit = {
    //todo while循环
    var age = 0
    while (age < 5) {
      println(age)
      age+=1
    }

    //至少走一次循环
    do{
      println("######"+age)
      age+=1
    } while (age < -1)
  }
}
