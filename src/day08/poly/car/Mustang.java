package day08.poly.car;

public class Mustang extends Car {

    // 모든 차들의 공통 기능
    public void accelerate() {
        System.out.println("머스탱이 달립니다.");
    }
    
    // 머스탱만의 고유 기능
    public void powerSound() {
        System.out.println("폭풍같은 배기소리가 납니다.");
    }
}
