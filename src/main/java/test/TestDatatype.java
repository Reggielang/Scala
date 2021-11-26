package test;

public class TestDatatype {
    public static void main(String[] args) {

        //java 中的基本数据类型，没有类型的概念，只有精度的概念
        // 0000 0001 =》byte
        // 0000 0000 0000 0001 =>short
        //可以扩大精度，但这样基本数据类型就改变了
        byte b = 1;
        test(b);


        char c = 'a'+1;
        System.out.println(c);

        //常量计算在编译时完成
        int i = 10+10+10;

        int d=100;
        byte by = (byte) d;//截取精度




    }





//    public static void test(byte b){
//        System.out.println("bbbbb");
//    }
    public static void test(short s){
        System.out.println("ssss");
    }
    public static void test(char c){
        System.out.println("ccc");
    }
    public static void test(int i){
        System.out.println("iii");
    }

}
