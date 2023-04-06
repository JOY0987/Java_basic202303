package day08.poly.car;

// 자동차 판매 대리점
public class CarShop {
    Car[] cars;

    // 다형성 이용 X => 배열을 하나하나 만들어야함;;
    Mustang[] mustangs;
    Stinger[] stingers;
    Tucson[] tucsons;
    
    // 대리점에 차를 입고하는 기능
    public void importCar() {
        // 다형성 이용 X
        /* mustangs = new Mustang[] {
                new Mustang(),
                new Mustang(),
                new Mustang()
                // 투싼, 스팅어는 넣을 수 없음
        }; */

        // 다형성 이용 O
        Car m = new Mustang();
        Car s= new Stinger();
        Car t = new Tucson();

        cars = new Car[]{
                new Mustang(),
                new Mustang(),
                new Mustang(),
                new Stinger(),
                new Tucson(),
        };
        
        // Object형 배열에는 문자열과 정수와 논리 등 모두 배열에 담을 수 있음
        Object[] oArr = {
                50, 30, 3.3, "zzz", false, new Mustang()
        };

    }

    // 주행 테스트 기능
    public void runTest() {
        importCar(); // 차 입고
        // 오버라이딩을 통해 균일한 작업이 가능해짐!
        for (Car car : cars) {
            car.accelerate();
        }
    }

    // 차를 고객에게 인도하는 기능
    // 리턴타입에 적용되는 다형성 예
    public Car exportCar(int money) {
        if (money == 6000) {
            return new Mustang();
        } else if (money == 5000) {
            return new Stinger();
        } else if (money == 3000) {
            return new Tucson();
        } else {
            return null;
        }
    }
}
