package _05_class._01_class;

import java.util.Scanner;

public class Rectangle {
    public int width;
    public int height;

    public Rectangle(int width, int height) {
        // 지역변수랑 필드 변수명이 동일하기 때문에 this 사용해서 필드 값에 접근
        this.width = width;
        this.height = height;
    }

    public int area() {
        return width * height;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("가로와 세로 길이를 띄어쓰기 기준으로 입력해주세요: ");

        int width = scanner.nextInt();
        int height = scanner.nextInt();

        // 입력 받은 값으로 Rectangle01 객체를 생성
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("사각형의 넓이 : " + rectangle.area());

        scanner.close();
    }
}