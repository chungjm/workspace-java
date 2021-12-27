package chapter5.reference;

public class Student {
    int studentID;
    String studentName;
    Subject korea;
    Subject math;
    // 선언만한다해서 Subject 클래스가 생성되지 않는다.
    // 이렇게 과목이 추가될 때마다 과목의 이름과 학점을 추가하는 것은 어렵다. 따라서 하나의 subject 클래스를 만들고 정리.
    //    int koreaScore;
    //    int mathScore;
    //    String koreaSubject;
    //    String mathSubject;

    public Student() {
        korea = new Subject("국어");
        math = new Subject("수학");
    }

    public Student(int id, String name) {
        studentID = id;
        // String 같은 class 처럼 new 를 사용하지 않아도되는 자료형 클래스도 있다.
        studentName = name;

        korea = new Subject("국어");
        math = new Subject("수학");
    }

    public void setKorea(int score) {
        korea.setScore(score);
    }

    public void setMath(int score) {
        math.setScore(score);
    }

    public void showStudentInfo() {
        int total = korea.getScore() + math.getScore();
        System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
    }

}
