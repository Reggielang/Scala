package scala_topic06

object Scala07_object_Instance2 {
  def main(args: Array[String]): Unit = {
  //todo 类-对象
  //todo 如果提供了类的构造方法，那么jvm不会提供无参的构造方法
  //之所有在类名后面提供构造方法，主要目的就是为了类的初始化

  //将构造方法分为了2大类：主构造方法&辅助构造方法
  //用于完成类的初始化的：主构造方法
  // 其他的为辅助构造方法是this关键字，其他和普通方法一致
  //辅助构造方法在执行之前，应该首先调用主构造方法，完成类的初始化
    //辅助构造方法可以重载，并且可以互相调用，但是调用的辅助构造方法，应该提前声明
    new User("lisi")
    new User()
    new User(20)
  }
  class User(name:String){
    println("aaaa")
    //辅助构造方法，在类初始化完成后，完成一些辅助的功能
    def this(){
      this("zhangsan")
      println("6666")
    }
    def this(age:Int){
      this("zhangsan")
      println("cccccc")
    }
  }
}

