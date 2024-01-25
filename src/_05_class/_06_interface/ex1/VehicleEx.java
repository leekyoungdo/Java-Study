package _05_class._06_interface.ex1;

public class VehicleEx {
    public static void main(String[] args) {
        // Vehicle 배열 생성
        Vehicle[] vehicles = new Vehicle[2];

        // Car 객체 생성 및 배열에 저장
        Car car = new Car("자동차" , 100);
        vehicles[0] = car;

        Airplane airplane = new Airplane("비행기", 500);
        vehicles[1] = airplane;

        // 추가
        // 상위 -> 하위 : ()명시
        // 하위 -> 상위 : 생략 가능

        // 배열 순회
        for(Vehicle vehicle : vehicles) {
            System.out.println("이름 : " +vehicle.getName());
            vehicle.move();

            System.out.println(vehicle instanceof Flyable);
            // Flyable 구현한 경우 fly() 메서드를 호출
            if (vehicle instanceof Flyable) {
                ((Flyable) vehicle).fly(); // 형 변환 (캐스팅) 해서 fly 실행
            }
        }
    }
}
