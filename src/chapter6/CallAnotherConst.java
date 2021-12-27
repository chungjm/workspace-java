package chapter6;

class Person {
    String name;
    int age;

    public Person() {
        // name = "이름 없음";
        // age = 1;
        // c++ Person("이름 없음", 1) 이렇게 하면 안되고, this("이름 없음", 1); !!
        // 또한 this 문장 위에 어떠한 statement 도 올 수 없다. 어떻게 보면 생성하지 않은 메모리에 멤버 변수를 설정할 수 있기에.
        this("이름 없음", 1);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
public class CallAnotherConst {
    public static void main(String[] args){
        Person p1 = new Person();
        System.out.println(p1.name);
    }
}
