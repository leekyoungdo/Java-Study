package _05_class._04_inheritance;

public class Cat extends Animal{

    public Cat(String type, String name, int age) {
        this.type = "고양이";
        this.name = name;
        this.age = age;
    }
    @Override
    public void makesound() {
        System.out.println("야옹");
    }
    public void moveSound() {
        System.out.println("사뿐");
    }
}
