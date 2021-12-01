package scala_topic06

object Scala07_object_Instance4 {
  def main(args: Array[String]): Unit = {
  //todo 类-对象
    //

    val user = new User("zhangsan")
  }
  class Person(s:String){
    println("aaaaa")
    def this(){
      this("lixi")
      println("bbbbb")
    }
  }
  // 在构造参数前使用var或者val声明
  class User(var name:String) extends Person("zhangsan") {
    println("ccccc")
    def this(){
      this("wangwu")
      println("ddddd")
    }
  }
}

