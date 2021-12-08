package Summer.APP

/*
controller:调度器，调度对象之间的关系

服务：逻辑服务

DAO:data access object

 */
import Summer.common.TApp
import Summer.controller.WordCountController

object WordCountApplication extends TApp with App {

  execute{
    val controller = new WordCountController
    controller.dispatch()
  }

}
