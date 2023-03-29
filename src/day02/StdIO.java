package day02;

import java.io.IOException;
import java.util.Scanner;

public class StdIO {

    public static void main(String[] args) throws IOException {

        int month = 10;
        int day = 3;
        String anni = " 개천절";

        // %d: 정수, %s: 문자열, %f: 실수
        System.out.printf("%d월 %d일은 %s입니다.\n",
                month, day, anni);

        double rate = 25.4567;

        // %f : 무조건 기본 자리수를 6자리로 표현 ex) 24.000000
        // % 뒤에 붙이는 .숫자로 소수점 자리수를 조정할 수 있음
        System.out.printf("오늘의 할인율은 %.8f입니다.\n", rate);
//        System.out.printf("오늘의 할인율은 %.1f%입니다.\n", rate);

        // ~Exception 으로 끝나는 오류를 잘 확인할 것!
        
        // 표준 입력
        Scanner sc = new Scanner(System.in);

//      int result = sc.nextInt();
//      int result = System.in.read();
        String str = sc.nextLine();
        int result = 0;
        try {
            // str을 정수 변환
            result = Integer.parseInt(str);
        } catch (Exception e) {
            System.out.println("정수로 입력하걸아");
        }

        System.out.println("result = " + result);

    }
}
