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
        /*park.driveMustang(new Mustang());
        park.driveStinger(new Stinger());*/
        // 다형성 O
        park.drive(new Mustang());
        park.drive(new Stinger());

        makeLine();

        Car mustang = new Mustang();
        mustang.accelerate();
//        mustang.powerSound(); -> Mustang만의 고유 기능이라 Car 타입은 사용 불가

        Stinger stinger = new Stinger();
        stinger.accelerate();

        makeLine();

        // 타입을 더 낮은거로 내릴때는 명시를 해줘야한다.
        // Mustang의 고유 기능을 사용하기 위해 다운 캐스팅이 필요한 상황!
        Car car = shop.exportCar(5000);
        System.out.println(car instanceof Stinger); // car가 Stinger의 객체인가?
        System.out.println(car instanceof Tucson);
        System.out.println(car instanceof Mustang);
//        System.out.println("Car = " + car); // Mustang@23ceabc1
//        car.powerSound();
    }
}
