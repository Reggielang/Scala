package test;

public class TestString {
    public static void main(String[] args) {

        //String字符串是不可变的
        //String类没有提供任何改变内容的方法，所以是不可变的字符串类型
        //所有的字符串操作都会产生新的字符串

        String s = " a b ";
        //trim方法
        s= s.trim();
        System.out.println(s);
    }
}
