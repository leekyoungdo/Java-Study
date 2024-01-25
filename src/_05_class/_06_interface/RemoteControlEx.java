package _05_class._06_interface;

public class RemoteControlEx {
    public static void main(String[] args) {
        // interface 도 하나의 타입이므로 변수의 타입으로 사용가능
        // - interface 는 참조 타입 -> null 대입 가능
        RemoteControl rc;


        // rc 변수에 TeleVision 객체를 대입
        rc = new TeleVision(); //RemoteControl rc = new TeleVision()
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        // rc 변수에 Audio 객체를 대입
        rc = new Audio();
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();

    }
}
