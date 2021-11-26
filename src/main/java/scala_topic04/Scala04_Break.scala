package scala_topic04
import scala.util.control.Breaks
import scala.util.control.Breaks._

object Scala04_Break {
  def main(args: Array[String]): Unit = {
    //todo break --
    for (i<- 1 to 5){
      if (i!=3){
        //scala语言中没有continue关键字
        //continue
        println(i)
      }

    }

    Breaks.breakable{
      for (i<- 1 to 5){
        if (i==3){
          //scala中没有break关键字，采用面向对象的方式代替
          //采用抛出异常的方式跳出循环
          Breaks.break()
        }
        println(i)
      }
    }

    breakable{
      for (i<- 1 to 5){
        if (i==3){
          //scala中没有break关键字，采用面向对象的方式代替
          //采用抛出异常的方式跳出循环
          break()
        }
        println(i)
      }
    }

    println("other")

  }
}
