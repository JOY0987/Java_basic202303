package day05.member;

// 역할: 회원 저장소 역할 (데이터베이스 같은 역할)
// 입출력 역할 안함! 필요 외의 업무를 주면 튄다 ㅎ
public class MemberRepository {

    public static final int NOT_FOUND = -1;

    Member[] memberList;

    public MemberRepository() {
        this.memberList = new Member[3]; // 3명을 만들어서 테스트
        memberList[0] = new Member("abc@def.com", "1234", 1, "콩벌레", Gender.MALE, 50);
        memberList[1] = new Member("ggg@ddd.com", "9999", 2, "커비잉", Gender.FEMALE, 500);
        memberList[2] = new Member("rrr@hom.com", "1111", 3, "별똥별", Gender.FEMALE, 20);
    }
    
    /**
     * 모든 회원 정보를 출력해주는 메서드
     */
    void showMembers() {
        System.out.printf("============ 현재 회원정보 (총 %d명) ============\n"
                                , memberList.length);
        for(Member m : memberList) {
            System.out.println(m.inform()); // 객체지향 프로그래밍
        }
    }
    
    /**
     * 회원 가입 기능
     * @param1 - newMember: 새롭게 회원가입하는 회원의 정보 (이렇게 친절한 주석을 달아주는게 좋닷)
     * @return: 회원가입 성공 여부
     *          성공시 true, 이메일이 중복되어 실패시 false
     */
    boolean addMember(Member newMember) { // 회원가입할 녀석의정보를 주면
        // 멤버 리스트에 넣어줄게
        // 이메일이 중복인가?
        if (isDuplicateEmail(newMember.email)) return false;
        
        // 실제로 멤버를 추가하는 코드
        Member[] temp = new Member[memberList.length + 1];
        for (int i = 0; i < memberList.length; i++) {
            temp[i] = memberList[i];
        }
        temp[temp.length - 1] = newMember;
        memberList = temp;

        return true;
    }
    
    /**
     * 이메일의 중복여부를 확인하는 기능
     * @param1 targetEmail : 검사 대상 이메일
     * @return : 중복되었을 시 true, 사용가능할 시 false
     */
    boolean isDuplicateEmail(String targetEmail) {
        for (Member m : memberList) {
            if(targetEmail.equals(m.email)) {
                return true;
            }
        }
        return false;
    }

    // 마지막 회원의 번호를 알려주는 기능
    int getLastMemberId() {
        return memberList[memberList.length - 1].memberId;
    }

    /**
     * 이메일을 통해 특정 회원 객체를 찾아서 반환하는 기능
     *
     * @param email
     * @param1 email : 찾고 싶은 회원의 이메일
     * @return : 찾은 회원의 객체 정보, 못찾으면 null 반환
     */
    Member findByEmail(String email) {
        for (Member m : this.memberList) {
            if (email.equals(m.email)) {
                return m;
            }
        }
        return null;
    }

    /**
     * 이메일을 통해 저장된 회원의 인덱스 값을 알아내는 메서드
     * @param email : 탐색 대상의 이메일
     * @return : 찾아낸 인덱스, 못찾으면 -1 리턴
     */
    int findIndexByEmail(String email) {
        for (int i = 0; i < memberList.length; i++) {
            if (memberList[i].email.equals(email))
                return i;
        }
        return NOT_FOUND;
    }

    /**
     * 비밀번호 수정하는 기능
     * 
     * @param email : 수정 대상의 이메일
     * @param newPassword : 변경할 새로운 비밀번호
     */
    boolean changePassword(String email, String newPassword) {
        // 인덱스 탐색
        int index = findIndexByEmail(email);

        // 수정진행
        if (index == NOT_FOUND) return false;
//        if (findIndexByEmail(email) != NOT_FOUND) return false; -> 비효율적, 재활용이 필요한 코드

        memberList[index].password = newPassword;
        return true;
    }
    
    void removeMember(String email) {
        // 인덱스 찾기
        int index = findIndexByEmail(email);

        // 앞으로 뗑기기

        for (int i = 0; i < memberList.length; i++) {

        }
        // 배열 마지막 칸 없애기
    }

}
