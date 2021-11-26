package test;

public class TestStringUtil {
    public static void main(String[] args){
        System.out.println(isNotEmpty(null));
    }
    //一个&表示短路，只满足一个，会空指针异常
    public static boolean isNotEmpty(String s){
        return s !=null &  s.trim().equals("");
    }
}
