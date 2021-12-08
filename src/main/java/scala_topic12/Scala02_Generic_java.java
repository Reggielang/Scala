package scala_topic12;

import java.util.ArrayList;
import java.util.List;

public class Scala02_Generic_java {
    public static void main(String[] args) {
        //todo 5 泛型和类型不是一个层次，泛型没有父子关系
        List<String> stringList = new ArrayList<String>();
//        test(stringList);

        List<Object> stringList1 = new ArrayList<Object>();
        test(stringList1);
    }

    public static void test(List<Object> list){
        System.out.println(list);
    }
}
