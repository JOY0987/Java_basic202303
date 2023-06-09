package day08.poly.book;

public class Book {

    // 책의 공통 기능
    private String title; // 도서명
    private String author; // 저자명
    private String publisher; // 출판사명

    // 대여 상태
    public Book() {

    }

    public Book(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getAuthor() {

        return author;
    }

    public void setAuthor(String author) {

        this.author = author;
    }

    public String getPublisher() {

        return publisher;
    }

    public void setPublisher(String publisher) {

        this.publisher = publisher;
    }
    
    // 책 정보 문자열 생성
    public String info() {
        // 문자열 글자수 얻기 length()
        int length = this.title.length();
        String prettier;
        if (length > 8) {
            // 문자열 슬라이스 substring()
            prettier = this.title.substring(0, 8) + "...";
        } else {
            prettier = this.title;
        }
        return String.format("제목: %s", prettier);
        // 자식클래스에서 오버라이딩을 통해 고유 정보를 함께 리턴하기
    }

    public String infoPlusAuthor() {
        return String.format("%s, 저자: %s", this.info(), this.author); // this 는 호출부의 this 가 사용됨
    }

}
