package _05_class._06_interface.ex1;

public class Vehicle  {

    private String name;

    private int maxSpeed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Vehicle(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed =maxSpeed;
    }

    // 추상 메서드
    public void move() {

    }
}
