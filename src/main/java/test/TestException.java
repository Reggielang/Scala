package test;

public class TestException {
    public static void main(String[] args) {
        //如果调用了为null对象的成员属性和成员方法，会产生空指针异常
        UserX userx = new UserX();
        test(userx.age);
        // Integer => 自动拆箱(Integer.intValue)=>int
    }

    public static void test (int age){
        System.out.println(age);
    }
}

class UserX{
//    public Integer age;
    public static Integer age;

}
