package test;

public class TestAdd {
    public static void main(String[] args) {
            int i =0;
            //int j = i++;

            //赋值，等号右边的计算结果给左边
            i=i++; //temp =0; i=1; i=temp=0
        System.out.println(i); //i=1
        //System.out.println(j); //j=0

            //todo 阶乘： 一个大于1的数的阶乘等于这个数乘以它减一的数的阶乘
            //5! = 5*4!=5*4*3!=5*4*3*2! = 5*4*3*2*1

        int result = test(5);
        System.out.println(result);

    }

    public static int test(int num){
        if (num<=1){
            return 1;
        }else {
            return num*test(num-1);
        }
    }
}
