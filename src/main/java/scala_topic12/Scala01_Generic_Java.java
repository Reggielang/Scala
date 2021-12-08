package scala_topic12;

import java.util.ArrayList;
import java.util.List;

public class Scala01_Generic_Java {
    public static void main(String[] args) {
        //todo 1泛型和类型的区别
        //类型：其实就是对外部数据做约束
        //泛型：其实就是对内部数据做约束
        //泛型和类型的层次不一样，不能作为整体来考虑

        //todo 2泛型在某些场合中其实就是类型的参数，用于向类中传递参数
        Test<User> userTest = new Test<User>();
        User t = userTest.t;

        Test userTest1 = new Test<>();
        Object t1 = userTest1.t;

        //todo 3 泛型时只在编译时有效，将这个操作称为’泛型擦除‘
//        Test<User> userTest2 = new Test<User>();
//        userTest2.t = new Emp();

        //todo 4 泛型的主要目的为了约束内部的数据类型
        List list = new ArrayList();
        list.add(new Emp());
        List<User> userList = list;
        //System.out.println(userList);
//        for (User user : userList) {
//
//        }

    }
}

class Test<T>{
    public T t;
}

class User{}