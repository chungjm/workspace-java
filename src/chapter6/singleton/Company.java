package chapter6.singleton;

public class Company {
    // 오직 하나만 생성되게 할 거고 외부에서 객체를 만들지 못하게 할 것이다.
    // 따라서 이 클래스 외부에서 생성하지 못하게 private 생성자 만들고 class 에서 객체를 하나 만들고 static
    private static Company instance = new Company();
    private Company() {}

    // static 을 넣지 않으면, 객체를 생성한다음 .getInstance()를 해야하는데, 이는 안되기에 앞에 static
    public static Company getInstance() {
        if (instance == null) {
            instance = new Company();
        }
        return instance;
    }
}
