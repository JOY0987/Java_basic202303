package day08.poly.book;

import day04.array.StringList;

import static day08.poly.book.RentStatus.*;

// 도서관리 시스템 데이터 처리
public class LibraryRepository {

    // 회원 1명
    private static BookUser bookUser;
    
    // 도서들의 정보
    private static Book[] bookList;

    static {
        bookList = new Book[] {  // Book 타입 배열이니까 하위 클래스 객체를 넣을 수 있음!
                new CookBook("기적의 집밥책", "김해진", "청림라이프", true),
                new CookBook("삐뽀삐뽀 119 이유식", "하정훈", "유니책방", false),
                new CookBook("오늘은 아무래도 덮밥", "이마이 료", "참돌", true),
                new CartoonBook("떨어지면 끝장", "스에노부 케이코", "대원씨아이", 18),
                new CartoonBook("원펀맨", "One", "대원씨아이", 15),
                new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12)
        };
    }

    // 유저를 등록하는 기능
    public void register(BookUser userInfo) {
        bookUser = userInfo; // bookUser 가 static이라 this가 없음
    }

    // 마이페이지 기능
    /*
        여기에 있는 bookUser 정보 리턴
    */
    BookUser findBookUser() {
        return bookUser;
    }

    // 모든 책의 정보를 알려주는 메서드
    public String[] getBookInfoList() {
        String[] infoList = new String[bookList.length];
        for (int i = 0; i < infoList.length; i++) {
            infoList[i] = bookList[i].info();
            // bookList 배열 안에는 카툰북, 쿡북 객체가 들어있음.
            // 객체 자체가 아니라 책의 정보만 출력하면 되므로, 만들어둔 info() 메서드를 사용해서 출력!
        }
        return infoList;
    }

    // 검색어를 받으면 해당 검색어를 포함하는 제목을 가진 책 정보들을 반환
    public String[] searchBookInfoList(String keyword) {
        StringList list = new StringList();
        // bookList에서 한권한권 확인하기
        for (Book book : bookList) {
            String title = book.getTitle(); // 책 제목
            if (title.contains(keyword)) {
                // 검색어에 걸린 책의 정보 문자열
                String info = book.info();
                list.push(info);
            }
        }
        return list.getsArr();
    }

    // 저자명 받으면 저자명이 일치하는 정보들을 반환
    public String[] searchBookInfoByAuthor(String inputAuthor) {
        StringList list = new StringList();
        for (Book book : bookList) {
            String author = book.getAuthor(); // 저자
            if (author.contains(inputAuthor)) {
                String infoPlusAuthor = book.infoPlusAuthor();
                list.push(infoPlusAuthor); // 쿡북과 카툰북의 info() 문자열
            }
        }
        return list.getsArr();
    }

    // 도서 대여 처리
    public RentStatus rentBook(int rentNum) {
        // 대여를 원하는 책 추출
        Book wishBook = bookList[rentNum - 1];
        
        // 책의 분류에 따라 다른 처리
        if (wishBook instanceof CookBook) {
            // 쿠폰 유무를 확인
            // isCoupon()은 쿡북의 전용 메서드이기 때문에 다운 캐스팅이 필요!
            CookBook cookBook = (CookBook) wishBook;
            if (cookBook.isCoupon()) {
                bookUser.setCouponCount(bookUser.getCouponCount() + 1);
                return RENT_SUCCESS_WITH_COUPON;
            } else {
                return RENT_SUCCESS;
            }
        } else if (wishBook instanceof CartoonBook) {
            // 연령 제한을 확인
            // getAccessAge()도 카툰북의 전용 메서드이기 때문에 다운 캐스팅이 필요!
            CartoonBook cartoonBook = (CartoonBook) wishBook;
            if (bookUser.getAge() >= cartoonBook.getAccessAge()) {
                // 빌릴 수 있는 경우
                return RENT_SUCCESS;
            } else {
                return RENT_FAIL;
            }
        }
        return RENT_FAIL; // if문에 안걸린다면?
    }
    
}
