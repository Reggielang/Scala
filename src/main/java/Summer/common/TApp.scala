package Summer.common

import Summer.Uitl.EnvCache
import Summer.controller.WordCountController

trait TApp {

  def execute(op: => Unit):Unit={
    EnvCache.put("D:/")
        println("开启环境")
        try{
          op
        }catch {
          case e:Exception=>e.printStackTrace()
        }

        println("释放环境")
    EnvCache.clear()
  }
//  def execute():Unit={
//    println("开启环境")
//    //模板方法设计模式
//    try{
//      doExecute()
//    }catch {
//      case e:Exception=>e.printStackTrace()
//    }
//
//    println("释放环境")
//  }
//  def doExecute():Unit

}
