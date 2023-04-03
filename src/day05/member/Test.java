package day05.member;

public class Test {

    public static void main(String[] args) {

        MemberRepository mr = new MemberRepository();

        Member thief = new Member("qqq@qqq.com", "0000", 4, "도둑", Gender.MALE, 555);

        mr.addMember(thief);
        mr.addMember(thief);
        mr.showMembers();

        boolean flag = mr.isDuplicateEmail("qqqq@wdq");
        System.out.println("flag = " + flag);

        // 수정 테스트
        // 기븐앤댄 방식 테스트 (데이터를 주고, 실제 상황을 만들고, 검증까지)
        String targetEmail = "rrr@hom.com";
        boolean updateFlag
                = mr.changePassword(targetEmail, "9999");
        
        if (updateFlag) {
            Member updateMember = mr.findByEmail(targetEmail);
            System.out.println("updateMember의 비번 = " + updateMember.password);
        } else {
            System.out.println("이메일이 잘못됨!");
        }
    }
}
