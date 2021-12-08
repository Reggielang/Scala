package Summer.common

import Summer.Uitl.EnvCache

import scala.io.Source

trait TDao {
  def readFile(path:String)={
    //todo 1.获取文件，获取原始数据
    val source = Source.fromFile(EnvCache.get()+path)
    val lines = source.getLines().toList
    source.close()
    lines
  }

}
