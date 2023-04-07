package day10.exception;

public class FinallyExample {

    public static void main(String[] args) {

        String[] pets = {"비둘기", "거북이", "앵무새"};

        for (int i = 0; i < 4; i++) {
            try {
                System.out.println(pets[i] + " 키울래요~"); // ArrayIndexOutOfBoundsException
//                System.out.println("애완동물 조아용~"); // 에러가 안날 때만 출력
                                                      // 에러가 난 시점에서 catch 로 가버리기 때문!
            } catch (Exception e) {
                System.out.println("애완동물 정보가 없습니다...");
//                System.out.println("애완동물 조아용~"); // 에러가 났을 때만 출력
            } finally {
                // 예외와 관계없이 항상 실행할 코드
                System.out.println("애완동물 조아용~");
                // 실무에서 언제 쓸 수 있냐묜
                // 데이터베이스 접속 후 다음 접속을 위해, 데이터베이스 연결을 종료시켜야 할 경우
            }
        }

        System.out.println("프로그램 정상 종료!");
    }
}
