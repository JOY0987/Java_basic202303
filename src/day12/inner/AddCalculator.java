package day12.inner;

// 인터페이스를 클래스를 통해서 구체화
public class AddCalculator implements Calculator {
    @Override
    public int operate(int n1, int n2) {
        return n1 + n2;
    }
}
