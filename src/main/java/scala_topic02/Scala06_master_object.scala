package scala_topic02

import test.User

import java.io.ObjectOutputStream
import java.net.Socket
/*
网络中输出对象
 */
object Scala06_master_object {
  def main(args: Array[String]): Unit = {
    //todo 连接服务器
    val client = new Socket("localhost",9999)

    val Objout = new ObjectOutputStream(client.getOutputStream)
    val user = new User()

    Objout.writeObject(user)
    Objout.flush()
    Objout.close()
    print("客户端向服务器发送数据")
    client.close()
  }

}
