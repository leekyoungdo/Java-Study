package _05_class._04_inheritance;

public class AnimalEx {
    public static void main(String[] args) {
        Cat cat = new Cat("고양이", "냥이",12);
        Dog dog = new Dog("강아지", "개냥이", 13);

        System.out.println(cat.type + "의 이름은 " + cat.name + "이고 " + cat.age + "살 입니다." );
        System.out.println(dog.type + "의 이름은 " + dog.name + "이고 " + dog.age + "살 입니다." );
        cat.makesound();
        cat.moveSound();
        dog.makesound();
        dog.moveSound();


    }
}
