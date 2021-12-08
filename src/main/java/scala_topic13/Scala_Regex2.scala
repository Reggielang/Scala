package scala_topic13

import scala.util.control.Breaks

object Scala_Regex2 {
  def main(args: Array[String]): Unit = {
    //todo 正则表达式
    val tel = "12345a78901"
    //^箭头表示字符串的开始位置
    //$表示字符串的结尾位置
    val r = "^\\d{11}$".r

    val maybeString = r.findFirstIn(tel)
    if (maybeString.isEmpty){
      println("不是电话号码")
    }else{
      println("是电话号码")
    }
    def isMobileNumber(number: String): Boolean ={
      //11= 3(?)+8
      val regex = "^((13[0-9])|(14[5,7,9])|(15[^4])|(18[0-9])|(17[0,1,3,5,6,7,8]))[0-9]{8}$".r
      //
      val length = number.length
      regex.findFirstMatchIn(number.slice(length-11,length)) != None
    }


//    println(checkTel(tel))
  }
//  def checkTel(tel:String):Boolean={
//    if (tel.size==11){
//      var r = true
//      Breaks.breakable{
//        for(c<- tel){
//          try {
//            c.toString.toInt
//          }catch {
//            case e: Exception=>{
//              r = false
//              Breaks.break()
//            }
//          }
//        }
//      }
//    r
//    }else{
//      false
//    }
//  }



}
