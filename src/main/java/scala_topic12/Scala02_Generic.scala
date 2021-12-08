package scala_topic12

object Scala02_Generic {
  def main(args: Array[String]): Unit = {
    //todo 也存在上限和下限
    val  p = new Producer[Child]
    p.produce(new Message[Child])
    p.produce(new Message[Parent])
    //p.produce(new Message[Subchild])

    val c = new Consumer[Child]
    val m = c.consume()
    m.data;

  }
  class Message[T]{
    var data : T = _

  }
  class Parent {}

  class Child extends Parent {}

  class Subchild extends Child {}
  class Producer[T]{
    def produce(message: Message[_ >: T]):Unit={

    }
  }

  class Consumer[T]{
    def consume():Message[_ <:T]={
      null
    }
  }
}



