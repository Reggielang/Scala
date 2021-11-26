package scala_topic02

import java.net.{ServerSocket, Socket}

object Scala04_master {
  def main(args: Array[String]): Unit = {
      //todo 连接服务器
    val client = new Socket("localhost",9999)

    val out = client.getOutputStream
    out.write(1)
    out.flush()
    out.close()
    print("客户端向服务器发送数据")
    client.close()
  }
}
