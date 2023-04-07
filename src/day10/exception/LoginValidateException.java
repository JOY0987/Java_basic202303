package day10.exception;

/*
    사용자 정의 예외 처리
    - 접미사가 Exception인 에러 클래스를 만든다!
    - 이름은 마음대로 짓는다 ( 먼지 알아볼 수 있게 )
    - RuntimeException 을 상속받는다!
    - 예외를 발생시킬 때, 던질 때, 받을 때 이름을 클래스명으로 작성한다.
* */
public class LoginValidateException extends RuntimeException {

    // 기본생성자
    public LoginValidateException() {
    }

    // 에러메시지를 받는 생성자
    public LoginValidateException(String message) {
        super(message);
    }
}
