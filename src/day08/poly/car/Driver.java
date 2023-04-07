package day08.poly.car;

// 운전자 객체

public class Driver {
/*
    public void driveMustang(Mustang m) {
        System.out.println("운전을 시작합니다.");
        m.accelerate();
    }

    public void driveStinger(Stinger s) {
        System.out.println("운전을 시작합니다.");
        s.accelerate();
    }
*/
    // 차 종류가 100가지라면 100가지의 drive 메서드를 전부 써야한다.
    // 그러니 슈퍼 클래스인 Car 형 파라미터를 받아서 처리하기
    public void drive(Car c) {
        System.out.println("운전을 시작합니다.");

        c.accelerate(); // 파라미터의 타입에 따라서 오버라이딩된 accelerate() 가 실행
    }
}
