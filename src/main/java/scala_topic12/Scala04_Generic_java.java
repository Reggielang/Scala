package scala_topic12;

import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.ArrayList;

public class Scala04_Generic_java {
    public static void main(String[] args) {
        //todo 6 可以定义泛型的边界
        //工厂模式
//        Producer<Child> p = new Producer<Child>();
//        p.produce(new Message<Child>());
//        p.produce(new Message<Parent>());

        Consumer<Child> c = new Consumer<Child>();
        Message<? extends Child> message = c.getMessage();
        Child data = message.data;

    }
}
class Message<T>{
    public T data;
}

class Producer<A>{
    public void produce(Message<? super A> message){

    }
}

class Consumer<B>{
    public Message<? extends B> getMessage(){
        return null;
    }
}