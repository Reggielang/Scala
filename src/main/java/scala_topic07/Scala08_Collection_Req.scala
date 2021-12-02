package scala_topic07

import scala.collection.immutable

object Scala08_Collection_Req {
  def main(args: Array[String]): Unit = {
    //todo WordCount--实战
    //不同省份的商品点击排行
    //word(省份-商品) - count(1)
    val datas = List(
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "鞋"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "鞋"),
      ("zhangsan", "河北", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "帽子"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "电脑"),
      ("zhangsan", "河南", "鞋"),
      ("lisi", "河南", "衣服"),
      ("wangwu", "河南", "电脑"),
      ("zhangsan", "河南", "电脑"),
      ("lisi", "河北", "衣服"),
      ("wangwu", "河北", "帽子")
    )

    //todo 将原始数据进行结构转换
    //人，省份，商品 =》 (省份，商品，1)
    val mapDatas = datas.map(
      t => {
        (t._2 + "-" + t._3, 1)
      }
    )

    //todo 将转换结构后的数据进行分组
    val groupDatas = mapDatas.groupBy(_._1)

    //todo 将分组后的数据进行聚合统计
    val cnt = groupDatas.mapValues(list => list.size)


    println(cnt)

    //todo 将聚合后的结果进行结构准换
    //将相同省份的数据准备放在一起
    //(省份-商品，count) => (省份,(商品,count))
    var mapData1 = cnt.toList.map(
      kv => {
        val k = kv._1
        val cnt = kv._2
        val ks = k.split("-")
        (ks(0), (ks(1), cnt))
      }
    )
    println(mapData1)

    //todo 将转换后的数据进行排序
    val groupDatas1 =
      mapData1.groupBy(_._1).mapValues(
      list=>list.map(_._2).sortBy(_._2)(Ordering.Int.reverse).take(3)//排序后取前三名
    )

    println(groupDatas1)


  }

}
