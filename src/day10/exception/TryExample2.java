package day10.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("정수1: ");
            int n1 = sc.nextInt(); // InputMismatchException

            System.out.print("정수2: ");
            String strN2 = sc.next();
            int n2 = Integer.parseInt(strN2); // NumberFormatException
            // parseInt() 안에 정수가 아닌 다른게 들어왔을 때

            int result = n1 / n2; // ArithmeticException
            System.out.println("result = " + result);
        } catch (InputMismatchException e) {
            System.out.println("첫번째 숫자는 정수로만 입력해주세요!");
        } catch (NumberFormatException e) {
            System.out.println("두번째 숫자도 정수로만 입력해주세요!");
        } catch (Exception e) {
            // 위 캐치에서 잡지 못한 에러가 발생하면 여기서 잡아줌!
            System.out.println("알 수 없는 에러입니다. 관리자에게 문의하세요.");
        }
        
        // 다중 캐치 : 모든 상황에 대해서 예외처리를 하거나, 마지막 캐치에 Exception 을 넣기

        System.out.println("프로그램 정상 종료");
    }
}
