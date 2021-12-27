package chapter7.array;

public class ArrayTest {
    public static void main(String[] args) {
        // int[] numbers = new int[10]  초기화 안하고 선언만 할 때
        // 초기화 할 때는 배열의 크기를 적어주지 않는다.
        // int[] numbers = {0, 1, 2};   가능이지만, new 키워드와 함께 쓰자
        // int[] numbers = new int[] {0, 1, 2};
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        for (int i = 0 ; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
