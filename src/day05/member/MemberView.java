package day05.member;

import java.util.Scanner;

import static day05.member.Gender.*;

// 역할: 회원관리 앱의 입출력을 담당
public class MemberView {
    
    Scanner sc;
    MemberRepository mr; // 의존관계, 'MemberView는 MemberRepository에 의존해서 멤버를 출력한다'
    
    public MemberView() {
        this.sc = new Scanner(System.in);
        this.mr = new MemberRepository();
    }
    
    /* 
     * 초기 메인 화면을 출력
     */
    void mainView() {
        System.out.println("\n#### 회원 관리 시스템 ####");
        System.out.println("* 1. 회원 정보 등록하기");
        System.out.println("* 2. 개별회원 정보 조회하기");
        System.out.println("* 3. 전체회원 정보 조회하기");
        System.out.println("* 4. 회원 정보 수정하기");
        System.out.println("* 5. 회원 정보 삭제하기");
        System.out.println("* 6. 프로그램 끝내기");
        System.out.println("=============================");
    }
    
    /*
     * 프로그램 화면 흐름을 제어하는 기능
     */
    void viewProcess() {
        while (true) {
            mainView();
            String menuNum = input(">> ");
            
            switch (menuNum) {
                case "1":
                    signUp();
                    break;
                case "2":
                    showDetailMember();
                    break;
                case "3": // 전체 멤버 조회
                    mr.showMembers();
                    stop();
                    break;
                case "4":
                    changePasswordViewProcess();
                    break;
                case "5":
                    break;
                case "6":
                    String answer = input("# 정말로 종료합니까? [y/n]");
                    if(answer.toLowerCase().charAt(0) == 'y') {
                        System.out.println("# 프로그램을 종료합니다.");
                        System.exit(0);
                    } else {
                        continue;
                    }
                    break;

                default:
                    System.out.println("\n# 메뉴 번호를 다시 입력하세요");
            }
        }
    }


    // 비밀번호 변경 입출력 처리
    void changePasswordViewProcess() {

        String email = input("# 수정할 대상의 이메일: ");

        // 대상 탐색
        Member foundMember = mr.findByEmail(email);

        if (foundMember != null) {
            // 수정 진행
            System.out.printf("%s님의 비밀번호를 변경합니다!\n"
                    , foundMember.memberName);
            // 기존 비밀번호와 같으면 변경 취소
            String newPassword = input("# 새로운 비밀번호: ");
            if (foundMember.password.equals(newPassword)) {
                System.out.println("# 기존 비밀번호와 같습니다!");
                return;
            }
            mr.changePassword(email, newPassword);
            System.out.println("\n# 비밀번호가 성공적으로 수정되었습니다.");

        } else {
            System.out.println("\n# 조회 결과가 없습니다.");
        }
        stop();
    }

    String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    // 엔터를 누르기전까지 멈추는 기능
    void stop() {
        System.out.println("\n======= 엔터를 눌러서 계속.. ======");
        sc.nextLine();
    }

    // 회원 등록 입력 처리
    void signUp() {
        System.out.println("\n# 회원 등록을 시작합니다!!");
        String email;
        while (true) {
            email = input("# 이메일: ");
            if(!mr.isDuplicateEmail(email)) {
                break;
            }
            System.out.println("# 중복된 이메일입니다 ㅋㅋ");
        }
        String name = input("# 이름: ");
        String password = input("# 패스워드: ");
        Gender gender;
        // while 앞에 라벨을 붙여서, switch문 안에 break가 checkGender를 멈출수있게 함!
        checkGender: while (true) {
            String inputGender = input("# 성별[M/F]: ");
            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    gender = MALE;
                    break checkGender;
                case 'F':
                    gender = FEMALE;
                    break checkGender;
                default:
                    System.out.println("# 성별을 M/F로 정확히 입력하세요");
            }
        }

        int age = Integer.parseInt(input("# 나이:"));

        // 실제 저장 명령
        Member newMember = new Member(email, password, mr.getLastMemberId() + 1, name, gender, age);
        mr.addMember(newMember);

        System.out.println("\n# 회원 가입 성공~~");
        stop();
    }
    
    // 회원 개별 조회를 위한 입출력 처리
    void showDetailMember() {
        // 이메일 입력하세요!
        System.out.println("# 조회를 시작합니다!");
        String email = input("# 이메일: ");
        Member foundMember = mr.findByEmail(email); // 배열에서 값을 찾는건 View의 역할이 아니기에 저장소에 시킴
        // 찾은 회원의 정보 출력
        if (foundMember != null) {
            System.out.println("======= 조회 결과 ======");
            System.out.println(foundMember.showDetailMemberByEmail());
            stop();
        } else {
            System.out.println("\n# 조회된 회원이 없습니다.");
        }
    }




}
