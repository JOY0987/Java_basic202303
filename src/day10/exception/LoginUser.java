package day10.exception;

public class LoginUser {

    String userAccount; // 가입된 계정명
    String userPassword; // 가입시 설정한 패스워드

    public LoginUser(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }

    // 로그인 검증
    public String loginValidate(String inputAccount, String inputPassword) throws LoginValidateException {

        // 회원 계정이 존재하는가?
        if (userAccount.equals(inputAccount)) {
            // 패스워드가 일치하는가?
            if(userPassword.equals(inputPassword)) {
                // 로그인 성공
                return "SUCCESS";
            } else {
                // 패스워드가 틀림
                throw new LoginValidateException("비밀번호를 똑바로 입력해주세요");
                // Exception 의 생성자를 통한 새로운 예외 발생
            }
        } else {
            // 계정 정보가 틀림
            throw new LoginValidateException("회원가입부터 해주세요");
            // Exception 의 생성자를 통한 새로운 예외 발생
        }
        // 프로그램은 에러 상황을 단순하게 생각하는 경우가 있음..(잔고 5000원인데 10000원 출금시 -5000원 하면 되는거 아니야?)
        // 위 같은 상황을 프로그램에게 위험한 상황이라고 알려주고싶어! -> throw 로 새로운 예외 발생시키기
    }
}
