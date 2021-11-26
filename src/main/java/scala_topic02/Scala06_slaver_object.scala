package scala_topic02

import java.io.ObjectInputStream
import java.net.ServerSocket
/*
网络中输入对象
 */
object Scala06_slaver_object {
  def main(args: Array[String]): Unit = {
    //todo 启动服务器
    val server = new ServerSocket(9999)


    println("服务器已经启动，等待服务器连接")
    val client = server.accept()

    val Objin = new ObjectInputStream(client.getInputStream)
    val user = Objin.readObject()
    println("从客户端接收的数据是 "+ user)
    Objin.close()

    client.close()
    server.close()
  }
}
