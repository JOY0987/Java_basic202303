package day08.poly.book;

import day05.member.Gender;

import static day05.member.Gender.*;
import static day07.Util.Utility.*;
import static java.lang.System.in;
import static java.lang.System.out;

public class LibraryView {

    // static 데이터는 생성자에서 초기화하면 안됨.
    // static 필드의 초기화는 static initializer (정적 초기화자)를 사용
    private static LibraryRepository repository;

    static {
//      호출하지 않아도 실행시 자동 초기화
        repository = new LibraryRepository();
    }

    // 회원정보 입력처리
    private static void makeNewBookUser() {
        out.println("\n# 회원 정보를 입력해주세요.");
        String name = input("# 이름: ");
        int age = Integer.parseInt(input("# 나이: "));
        Gender gender = inputGender();

        BookUser userInfo = new BookUser();
        userInfo.setName(name);
        userInfo.setAge(age);
        userInfo.setGender(gender);

        // 입력받은 유저객체를 저장소로 보내기
        repository.register(userInfo);
    }

    // 정확하게 성별을 입력할때까지 반복 입력받는 메서드
    private static Gender inputGender() {
        while (true) {
            String inputGender = input("# 성별(M/F): ");
            Gender gender;
            switch (inputGender.toUpperCase().charAt(0)) {
                case 'M':
                    return MALE;
                case 'F':
                    return FEMALE;
                default: out.println("\n# 성별을 잘못 입력햇습니다.");
            }
        }
    }

    // 화면 처리
    protected static void start() {
        makeNewBookUser();
        while (true) {
            showMainScreen();
            selectMenu();
        }
    }

    // 메뉴 번호를 입력받고 분기를 나눠주는 메서드
    private static void selectMenu() {
        String menuNum = input("- 메뉴 번호: ");

        switch (menuNum) {
            case "1":
                myPage();
                stop();
                break;
            case "2":
                showBookList();
                stop();
                break;
            case "3":
                searchBook();
                stop();
                break;
            case "4":
                rentalBook();
                stop();
                break;
            case "5":
                searchBookByAuthor();
                stop();
                break;
            case "9":
                out.println("# 프로그램을 종료합니다.");
                System.exit(0);
                break;
            default:
                out.println("\n# 메뉴 번호를 다시 입력하세요");
        }
    }

    // 실행
    private static void showMainScreen() {
        out.println("============== 도서 메뉴 ===============");
        out.println("# 1. 마이페이지");
        out.println("# 2. 도서 전체 조회");
        out.println("# 3. 도서 제목으로 검색");
        out.println("# 4. 도서 대여하기");
        out.println("# 5. 도서 저자이름으로 검색");
        out.println("# 9. 프로그램 끝내기");
    }
    
    // 저자 이름으로 도서 검색
    private static void searchBookByAuthor() {
        String inputAuthor = input("# 저자명: ");

        String[] bookInfoList =  repository.searchBookInfoByAuthor(inputAuthor);
        searchBookInfoList(bookInfoList);
    }



    // 도서이름으로 도서 검색
    private static void searchBook() {
        // 사용자에게 검색어를 입력받는다.
        String keyword = input("# 검색어: ");

        // 저장소에게 해당 검색어를 주면서 검색에 걸린 책 정보를 내놓으라고 해야함
        String[] bookInfoList = repository.searchBookInfoList(keyword);
        searchBookInfoList(bookInfoList);
    }

    // 도서명과 저자명으로 책 찾는 메서드
    private static void searchBookInfoList(String[] bookInfoList) {
        if (bookInfoList.length > 0) {
            out.println("============ 검색 결과 =============");
            for (String bookInfo : bookInfoList) {
                out.println(bookInfo);
            }
        } else {
            out.println("\n# 검색 결과가 없습니다.");
        }
    }


    // 도서 대여하기
    private static void rentalBook() {
        // 대여 가능한 책의 목록을 번호와 함께 출력
        String[] rentalList = repository.getBookInfoList();
        out.println("\n=========== 대여 가능한 도서 정보 ============");
        int bookNum = 1;
        for (String info : rentalList) {
            out.printf("%d. %s\n", bookNum++, info);
        }
        String rentNum = input("- 대여할 도서 번호 입력: ");
        RentStatus rentStatus  = repository.rentBook(Integer.parseInt(rentNum));
        if (rentStatus == RentStatus.RENT_SUCCESS_WITH_COUPON) {
            out.println("# 성공적으로 요리책이 쿠폰발급과 함께 대여되었습니다.");
        } else if (rentStatus == RentStatus.RENT_SUCCESS) {
            out.println("# 도서가 성공적으로 대여되었습니다.");
        } else {
            out.println("# 도서 대여에 실패했습니다.");
        }
    }


    // 도서 전체 확인
    private static void showBookList() {
        String[] infoList = repository.getBookInfoList();
        out.println("\n================ 모든 도서 정보 ===============");
        for (String info:infoList) {
            out.println(info);
        }
    }

    // 마이페이지
    private static void myPage() {
        BookUser user = repository.findBookUser();
        out.println("\n******** 회원님 정보 *********");
        out.printf("# 회원명: %s  |  # 나이: %d  | # 성별: %s  | # 쿠폰갯수: %d\n"
                    , user.getName(), user.getAge(), user.getGender(), user.getCouponCount());
    }
    
    // 선택기능 수행 후 바로 선택 메뉴가 뜨지 않도록 하는 메서드
    private static void stop() {
        System.out.println("\n======= 엔터를 눌러서 계속.. ======");
        sc.nextLine();
    }
}
