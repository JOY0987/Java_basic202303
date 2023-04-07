package day10.exception;

public class TryExample1 {

    public static void main(String[] args) {

        int n1 = 10, n2 = 0; // 1

        System.out.println("나눗셈 시작!"); // 2 - 예외 가능성 X

        try {
            // 예외 발생 가능성이 있는 코드 <- 예외 처리 Ctrl+Art+T
            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2); // 3
        } catch (Exception e) { // 예외가 발생하면 처리할 코드
                                // Exception -> 어떤 예외든 처리 가능
            System.out.println("0으로 나눌 수 없습니다.");
            // 개발 시에 쓰는 코드 (로그 트레이싱)
            e.printStackTrace(); // 어떤 에러가 났는지 기록을 남김
        }

        System.out.println("프로그램 정상 종료"); // 4
    }
}
