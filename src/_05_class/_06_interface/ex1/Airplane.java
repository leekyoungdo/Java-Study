package _05_class._06_interface.ex1;

public class Airplane extends Vehicle implements Flyable{

    // 생성자

    public Airplane(String name, int maxSpeed) {
        super(name, maxSpeed);
    }

    // move 메서드 오버라이드

    @Override
    public void move () {
        System.out.println(getName() + "이(가) 하늘을 나는중");
    }

    // fly 메서드 구현 (Flyable 인터페이스에서 온 메서드)

    @Override
    public void fly() {
        System.out.println("고도 10,000 피트에서 비행중");
    }
}
