package chapter6.singleton;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {
        // company 오직 객체 하나만 만들고 싶을
        Company c1 = Company.getInstance();
        Company c2 = Company.getInstance();

        // 두 개는 같은 instance 를 가리킨다.
        System.out.println(c1);
        System.out.println(c2);

        Calendar cal = Calendar.getInstance();
    }
}
