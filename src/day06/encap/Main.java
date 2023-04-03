package day06.encap;

public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("그랜져");

//        myCar.speed = 10000; // 10000키로로 달려도되지?
//        myCar.mode = 'A'; // A모드로 출고시킬거야!
//        myCar.model = "모닝"; // 네 차 모델 바꿀거야!
                          // => 맘대로 못 바꾸게 필드에 접근제한자 걸어주기

        myCar.setSpeed(150);
        System.out.println(myCar.getSpeed());

        myCar.setMode('A');
        System.out.println(myCar.getMode());

        myCar.pressButton();
//        myCar.inject();
//        myCar.putOil();
//        myCar.moveCylinder();
//        버튼 누르기 전 순서가 조금이라도 바뀌면 차가 폭발?? => 캡슐화해주자!
    }
}
