package scala_topic06

object Scala07_object_Instance3 {
  def main(args: Array[String]): Unit = {
  //todo 类-对象
    //

    val user = new User("zhangsan")
    user.name
  }
  // 在构造参数前使用var或者val声明
  class User(var name:String){

  }
}

