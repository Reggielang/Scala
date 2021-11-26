package test;

import java.io.Serializable;
/*
传输数据必须进行序列化
 */
public class User implements Serializable {
    public static int age =30;

    @Override
    public String toString() {
        return "User["+age+"]";
    }
}
