package scala_topic05

object Scala04_function3 {
  def main(args: Array[String]): Unit = {
    //todo 递归函数 --
    // 要求递归函数，必须明确声明返回值类型
    // 函数内部调用自身
    // 一定要能跳出递归的逻辑得到最后的结果
    // 递归的函数在调用时，传递的参数之间有关系
    //阶乘
    def myFun(num:Int):Int={
      if (num<=1){
        1
      }else{
        num*myFun(num-1)
      }
    }

    println(myFun(5))
    //栈内存溢出-- 线程有关-- 每个线程就有一个栈
    //堆内存溢出-- Major GC


  }
}
