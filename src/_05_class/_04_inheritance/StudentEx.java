package _05_class._04_inheritance;

public class StudentEx {
    public static void main(String[] args) {
        Student std1 = new Student("김새싹", 20);

        // Case1. 부모, 자식 클래스의 필드가 public 인 경우
        // Person(부모) 클래스로부터 상속받은 필드 값 읽기
//        System.out.println(std1.name); // 김새싹
//        System.out.println(std1.age); // 20
//
//        // 자식 클래스 필드 값 읽기
//        System.out.println(std1.campus); // null (setter 실행 X)
//
//        // Person 으로 부터 상속받은 메소드 호출
//        std1.say();
//        std1.eat("바나나");
//
//        // Student 메소드 호출
//        std1.setCampus("새싹 용산");
//        System.out.println(std1.campus);


        /////////////////////////////////////////
        // Case 2. 부모, 자식 클래스의 필드가 private 인 경우
        // Person 으로부터 상속받은 필드 읽기
        System.out.println(std1.getName());
        System.out.println(std1.getAge());

        // Student 필드 읽기
        System.out.println(std1.getCampus());

        // Person 으로부터 상속 받은 메소드 호출
        std1.say(); // public 메소드

        // Student 메소드 호출
        std1.setCampus("새싹 용산");
        System.out.println(std1.getCampus());
    }
}