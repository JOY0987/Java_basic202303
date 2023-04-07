package day08.poly.car;

import day07.Util.Utility;

import static day07.Util.Utility.makeLine;

public class Main {

    public static void main(String[] args) {

        CarShop shop = new CarShop();
        shop.runTest();

        makeLine();

        Driver park = new Driver();

        // 다형성 X
        /*
        park.driveMustang(new Mustang());
        park.driveStinger(new Stinger());
        */

        // 다형성 O => Car 형 객체를 파라미터로 받는 메서드 하나로 모든 차를 처리할 수 있다
        park.drive(new Mustang());
        park.drive(new Stinger());

        makeLine();

//        Car mustang1 = new Mustang();
        Mustang mustang = new Mustang();
        mustang.accelerate(); // 오버라이딩된 mustang 의 accelerate() 가 출력
        mustang.powerSound(); // -> Mustang 만의 고유 기능이라 Car mustang1 은 사용 불가

        Stinger stinger = new Stinger();
        stinger.accelerate();

        makeLine();

        Car car = shop.exportCar(5000);
        // 타입을 더 낮은거로 내릴때는 명시를 해줘야한다.
        // Mustang 클래스의 고유 기능을 사용하기 위해서는 다운 캐스팅이 필요!
        Mustang car1 = (Mustang) shop.exportCar(6000); // Car 리턴 타입을 Mustang 으로 다운
        car1.powerSound();

        System.out.println(car instanceof Stinger); // car 가 Stinger 의 객체인가?
        System.out.println(car instanceof Tucson);
        System.out.println(car instanceof Mustang);
        System.out.println("Car = " + car); // Stinger@56f4468b

    }
}
