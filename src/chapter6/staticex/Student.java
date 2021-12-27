package chapter6.staticex;

public class Student {
    private static int serialNum = 10000;
    int studentID;
    String studentName;

    public Student() {
        studentID = serialNum++;
    }

    public static int getSerialNum() {
        // 지역 변수는 static 함수에 써도 된다.
        // int i = 10;
        // 그러나 멤버 변수는 절대 안 된다. 메모리 상 위치가 다르기에, 호출 위치랑 메모리 놓아주는 과정이 달라.

        // studentName = "홍길동"; 멤버 변수, 인스턴스 변수 사용 불 가능
        return serialNum;
    }
}
