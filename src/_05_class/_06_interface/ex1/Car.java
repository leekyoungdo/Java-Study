package _05_class._06_interface.ex1;

public class Car extends Vehicle{

    public Car(String name, int maxSpeed) {
        super(name, maxSpeed);

    }
    // move 메서드 오버라이드
    @Override
    public void move() {
        System.out.println(getName() + "이(가) 도로를 따라 이동중");
    }
}
