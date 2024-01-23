package _05_class._03_final;

import java.util.Scanner;

public class Circle {
    final double radius;
    public static final double PI = 3.141592;

    public Circle(double radius) {
        this.radius = radius;
    }

    public static double calculateArea(double radius) {
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("원의 반지름을 입력해주세요");
        double radius = sc.nextDouble();

        Circle circle = new Circle(radius);

        System.out.println("원의 반지름 : " + radius );
        System.out.println("원의 넓이 : " + calculateArea(radius));

    }
}
