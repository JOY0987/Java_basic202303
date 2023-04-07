package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {

    // 정수를 입력받아서 리턴하는 메서드
    public int inputNumber() throws InputMismatchException { // throws : 특정 에러가 날거라고 경고하는 개념
                                                             // 여기서 처리하지는 않고 메서드 호출자에 떠넘김
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // 예외1
        return num;
    }
    // 문자열을 정수로 변환하는 기능
    public int convert(String s) throws NumberFormatException, NullPointerException {
        int n = Integer.parseInt(s); // 예외2
        return n;
    }

    // 예외1 + 2 에서 던진 예외들을 한번에 처리하는 부분
    public void convertAndInput() {
        try {
            int n = inputNumber();
            int m = convert("100");
        } catch (InputMismatchException e) {
            System.out.println("정수입력 잘해라..");
        } catch (NumberFormatException e) {
            System.out.println("숫자 변환 불가능");
        }
    }
}
