package scala_topic12

object Scala01_Generic {
  def main(args: Array[String]): Unit = {
    //todo scala中泛型和Java中的泛型大同小异
    // 1.scala中的泛型采用中括号
    //  2.scala中的泛型也是不可变的
    //  3.如果能将类型和泛型当成一个整体来使用，如果将类型和泛型联合使用，类型相同时，如果泛型存在父子类关系，那么联合的类型也就存在父子类关系
    //  协变 +T
    // 如果类型相同，泛型之间存在父子关系，那么让联合后的类型存在子父关系
    // 逆变 -T
    val message1: Message[Child] = new Message[Child]();
    val message2: Message[Child] = new Message[Parent]();
    //val message3: Message[Child] = new Message[Subchild]();


  }
//  class Message[+T]{
//
//  }
  class Message[-T]{

  }
  class Parent {}

  class Child extends Parent {}

  class Subchild extends Child {}
}


