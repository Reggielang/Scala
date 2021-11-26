package test;

import scala.Int;

public class TestOper {
    public static void main(String[] args) {
        String s1 = new String("abc");
        String s2 = new String("abc");

        System.out.println(s1 ==s2); //false ==在Java中比较的是内存地址

        System.out.println(s1.equals(s2));//比较内容


        Integer i1 = 100;
        Integer i2 = 100;
        System.out.println(i1==i2);
    }
}
