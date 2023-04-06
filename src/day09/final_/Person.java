package day09.final_;

/*
    final 은 상수가 아니다!
    final : 불변성
    상수 : 불변성, 유일성
*/

class BagPack { // final class => 이미 완벽한 클래스니까 고치지마!
    // 속성
    int size; // 가방 크기 (1 ~ 10)
    String brand; // 브랜드
    
    // 기능
    final void putItem() { // final 메서드 => 오버라이딩 하지마!
        System.out.println("가방에 물건을 넣습니다.");
    }
    void getItem() {
        
    }

    public BagPack(int size, String brand) {
        this.size = size;
        this.brand = brand;
    }
}

class SmartBagPack extends BagPack {

    public SmartBagPack(int size, String brand) {
        super(size, brand);
    }

    @Override
    void getItem() {
        super.getItem();
    }
    // putItem()은 final 메서드라서 오버라이딩이 불가능
}
public class Person {
    
    String name; // 이름
    final String ssn; // 주민번호
    
    // 상수는 불변성, 유일성
    // final로 불변성, static으로 유일성 만족하면 상수처럼 만들 수 있음
    static final String nation; // 국적
    final BagPack bagPack; // 가방

    static {
        nation = "대한민국";
    }

    public Person(final String name, String ssn, BagPack bagPack) {
                // 지역변수에도 final을 붙일수 있다.
                // 인수로 받은 name의 값을 메서드 안에서 바꿀 수 없음
        this.name = name;
        this.ssn = ssn;
        this.bagPack = bagPack;
    }
}
