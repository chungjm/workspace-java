package chapter5;

public class functionTest {
    public static void main(String[] args){
        int num1 =10;
        int num2= 20;
        // addNum 을 아래에 선언해도 가능이다.
        int sum = addNum(num1,num2);
         System.out.println(sum);
    }
    public static int addNum(int n1, int n2){
         int result = n1 +n2;
         return result;
    }
}
