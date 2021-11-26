package scala_topic02

import java.net.ServerSocket

object Scala04_slaver {
  def main(args: Array[String]): Unit = {
      //todo 启动服务器
    val server = new ServerSocket(9999)
    println("服务器已经启动，等待服务器连接")
    val client = server.accept()

    val input = client.getInputStream
    val i = input.read()
    println("从客户端接收的数据是 "+i)
    input.close()

    client.close()
    server.close()
  }
}
