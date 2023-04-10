package day11.api.obj;

import java.util.Objects;

public class Pen extends Object {

    Company company; // 제조 회사
    
    long serial; // 시리얼 번호
    String color; // 색상
    Integer price; // 가격

    public Pen(long special, String color, int price) {
        this.serial = special;
        this.color = color;
        this.price = price;
    }

    // 객체의 필드데이터를 빠르게 확인해볼때 toString 재정의하기
    //
    // Alt + ins / toString 마법사로 생성
    @Override
    public String toString() {
        return "Pen{" +
                "company=" + company +
                ", serial=" + serial +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
    
    // 객체의 중복 처리

    // 시리얼 번호가 같으면 같은 객체로 보고 싶어!
    // equals 메서드 재정의 : 값이 중복인 객체를 같은 것으로 본다. Set 에 저장하기 전에 중복을 걸러줄 수 있다.
    // equals 를 오버라이딩 하면 반드시 HashCode 도 같이 오버라이딩 해야 완벽한 중복처리 가능
    @Override
    public boolean equals(Pen this, Object obj) {
        if (obj instanceof Pen) {
            Pen target = (Pen) obj; // 1. obj 다운캐스팅 -> 같은걸 비교해야지!
            return this.serial == target.serial
                    && this.color.equals(target.color); // 시리얼 번호가 같고 색이 같으면 같은 객체
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serial, color);
        // 시리얼 넘버, 색이 같으면 중복 객체로 처리
    }
}
