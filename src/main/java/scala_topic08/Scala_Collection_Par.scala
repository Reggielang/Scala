package scala_topic08

/*
多线程的条件下：

串行，一个CPU，一个线程执行完毕，另外一个线程才能通过CPU来执行
并发，一个CPU，三个线程同时争夺CPU的执行权，一会儿A，一会儿B，一会儿C
并行，多个CPU，抢占多个CPU的执行权

线程安全问题：怎么解决？
一个线程有一个栈
所谓的线程安全问题，其实就是多线程并发执行时，对共享内存中的共享对象的属性进行修改，所导致的数据冲突问题。
多例不会出现线程安全问题：你访问你的，我访问我的
把对象弄到栈上分配，但有风险

 */
object Scala_Collection_Par {
  def main(args: Array[String]): Unit = {
    val result1 = (0 to 100).map{x => Thread.currentThread.getName}
    val result2 = (0 to 100).par.map{x => Thread.currentThread.getName}

    println(result1)
    println(result2)
  }

}
