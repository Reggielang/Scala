package Summer.controller

import Summer.common.TController
import Summer.service.WordCountService

import scala.io.Source

class WordCountController extends TController{
  private val WordCountService = new WordCountService

  //调度
  def dispatch():Unit={
    val wordcount = WordCountService.analysis()
    //todo 5.将统计的结果打印
    println(wordcount)
  }


}
