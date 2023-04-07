package day10.exception;

public class ThrowsMain {

    public static void main(String[] args) {
        // 메인에서 예외처리 X

        ThrowsExample te = new ThrowsExample();

        int n = te.inputNumber();
        int m = te.convert("100");

    }
}
