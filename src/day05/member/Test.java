package day05.member;

public class Test {

    public static void main(String[] args) {

        MemberRepository mr = new MemberRepository();

        Member thief = new Member("qqq@qqq.com", "0000", 4, "도둑", Gender.MALE, 555);

        mr.addMember(thief);
        mr.addMember(thief);
        mr.showMembers();

//        boolean flag = mr.isDuplicateEmail("qqqq@wdq");
//        System.out.println("flag = " + flag);
    }
}
