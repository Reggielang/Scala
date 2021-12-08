package scala_topic12;

import java.util.ArrayList;
import java.util.List;

public class Scala03_Generic_java {
    public static void main(String[] args) {
        //todo 6 泛型的不可变

        ArrayList<Child> list1 = new ArrayList<Child>();
//        ArrayList<Child> list2 = new ArrayList<Parent>();
//        ArrayList<Child> list3 = new ArrayList<Subchild>();
    }
}
class Parent{}

class Child extends Parent{
}

class Subchild extends Child{

}
