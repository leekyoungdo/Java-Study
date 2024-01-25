package _05_class._04_inheritance;

public class Dog extends Animal{

    public Dog(String type, String name, int age) {
        this.type = "강아지";
        this.name = name;
        this.age = age;
    }
    @Override
    public void makesound() {
        System.out.println("왈");
    }
    public void moveSound() {
        System.out.println("터벅");
    }
}
