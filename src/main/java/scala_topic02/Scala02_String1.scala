package scala_topic02

object Scala02_String1 {

    def main(args: Array[String]): Unit = {
      //todo 字符串的拼接
      val name="zhangsan"
      val password="123456"
      print("Hello "+name)

      //JSON=》 JAVAscript   object notation
      //JSON字符串--符合JSON格式的字符串

      //网络中转递的数据基本都是以JSON字符串的格式传输的

      //传值字符串
//      printf("username : %s\n",name)
//      printf("password : %s",password)
//
//      //插值字符串
//      print(s"username :$name")
//
//      val json = s"{\"username\":\"${name}\"}"
//      print(json)

      //多行字符串
      val s=
        """hello
          |Scala
          |""".stripMargin

      print(s)


      val json2 =
        s"""
          |{"username":"${name}","password":"${password}"}
          |""".stripMargin

      print(json2)

      val sql1 =
        """
          |select
          |   id
          |from
          |   (
          |   select*from t_user where id =1
          |   order by id desc
          |   ) a
          |   group by id
          |""".stripMargin
    }

}
