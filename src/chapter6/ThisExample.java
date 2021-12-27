package chapter6;

class BirthDay {
    int day;
    int month;
    int year;

    public void setYear(int year){
        // 자기 자신의 메모리상 year 값 (=this.year)
        this.year = year;
    }

    public void printThis() {
        System.out.println(this);
    }

    public BirthDay() {}

    public BirthDay(int day, int month, int year) {
        // 코드에서 this 를 생략하게 되면, day, month, year 파라미터로 사용되는 day, month, year 로 인식된다.
        this.day = day;
        this.month = month;
        this.year = year;
    }
}

public class ThisExample {
    public static void main(String[] args) {
        BirthDay b1 = new BirthDay();
        BirthDay b2 = new BirthDay();

        System.out.println(b1);
        b1.printThis();

        System.out.println(b2);
        b2.printThis();
    }
}
