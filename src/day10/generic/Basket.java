package day10.generic;

public class Basket<F> {
    // 인터페이스 Fruit와는 전혀 상관 X
    // < > 안에는 아무거나 써도 된다! (의미가 없다)
    // 보통 한 글자를 넣어줌!!

    private F fruit;

    public F getFruit() {
        return fruit;
    }

    public void setFruit(F fruit) {
        this.fruit = fruit;
    }
}
