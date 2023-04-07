package day10.exception;

public class UserMain {

    public static void main(String[] args) {

        LoginUser user = new LoginUser("abc123", "1234");

        // 메인이라 더 이상 던지기 불가
        try {
            user.loginValidate("abc124", "1111");
        } catch (LoginValidateException e) {
            // getMessage: 에러원인 메시지를 리턴
            System.out.println(e.getMessage());
        }

    }
}
