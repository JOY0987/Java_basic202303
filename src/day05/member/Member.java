package day05.member;

import java.time.LocalDate;

// 역할: 1명의 회원 정보를 묶어주는 역할
// Java Bean (자바 커피콩) 이라고 부름 -> 콩들이 모여서 하나의 프로그램이 된다는 뜻!
public class Member {
    
    String email;
    String password;
    int memberId;
    String memberName;
    Gender gender;
    int age;

    // 회원가입일
    LocalDate regDate;
    
    // 생성자
    // 모든 필드를 초기화하는 생성자


    public Member(String email, String password, int memberId, String memberName, Gender gender, int age) {
        this.email = email;
        this.password = password;
        this.memberId = memberId;
        this.memberName = memberName;
        this.gender = gender;
        this.age = age;
    }

    // 회원정보를 문자열로 만들어서 리턴하는 기능(메서드)
    public String inform() {
        String convertGender = (gender == Gender.MALE) ? "남성" : "여성";
        return String.format("# %d번 | %s | %s | %s | %d세"
                        , this.memberId, this.email, this.memberName
                        , convertGender, this.age);
    }
    
    // 회원정보를 수직정렬하여 문자열로 리턴하는 기능
    String showDetailMemberByEmail() {
        String convertGender = (gender == Gender.MALE) ? "남성" : "여성";
        return String.format("# 이름: %s\n# 비밀번호: %s\n# 성별: %S\n# 나이: %d세"
                , this.memberName, this.password
                , convertGender, this.age);
    }

}
