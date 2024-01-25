package _05_class._08_generic;

// 참고. Number 클래스
// Java 의 모든 숫자 형식의 부모 클래스

// 제네릭 제한

class Box<T extends Number> {

    private T item;
    private  void setItem(T item) {
        this.item = item;
    }
}

interface Moveable {
    void move();
}

class Car implements Moveable {
    @Override
    public void move() {
        System.out.println("자동차 출발 !");
    }
}

class Container<T extends Moveable>{
    private T item;
    public Container (T item) {
        this.item = item;
    }
    public void makeItMove() {
        item.move();
    }
}
public class GenericEx2 {
    public static void main(String[] args) {
        // Box<String> stringBox = new Box<String>()
        Box<Double> doubleBox = new Box<>();

        // case 2
        Container<Car> carContainer = new Container<>(new Car());
    }
}

