package _05_class._03_final;

import _05_class._02_static.Student01;

public class Student {

    //final 필드
    final String campus = "용산"; // 1. 필드 선안시 초기화
    final String sid; // 2. 생성자에서 초기화

    public Student (String sid) {
        this.sid = sid;

    }

    public static void main(String[] args) {
        Student std1 = new Student("s001");
        System.out.println(std1.campus);
        System.out.println(std1.sid);

        // final 필드 값 변경 불가능
        // std1.compus = "영등포" // 에러
    }
}
