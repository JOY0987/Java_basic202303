package day04;

// 댄서의 설계도
// 설계도에는 main을 만들지 않음. 즉, 실행하지 않음.
// main으로 설계도를 실행하는 것!
// 실행용 클래스, 설계용 클래스가 나뉘어져있음!!
public class Dancer {

    // 속성 (필드)
    // 변수 아님! 메서드 안에 있어야 변수..
    // 값을 대입하기 전에는 기본값을 가지고 있음.
    // String dancerName = "김철수"; 처럼 값을 미리 대입하지 않음!

    String dancerName; // 댄서 이름

    String crewName; // 크루 이름

    String genre; // 춤 장르

    DanceLevel level; // 춤 수준 (0: 초보자, 1: 중수, 2: 고수)

    // 생성자 : 스카우터 or 개발자, 기술자
    // 클래스 이름과 똑같이 만들어야 함! 아니면 메서드로 인식됨...
    // 생성자도 함수개념, 리턴타입이 void로 고정 (어차피 void니까 작성ㄴㄴ)
    // 리턴값은 생성한 객체의 주소값을 리턴
    // 객체 생성시 필요한 데이터를 셋팅
    Dancer() {
        dancerName = "갑돌이";
        crewName = "돌아이들";
        genre = "아이돌댄스";
        level = DanceLevel.AMATUER;
    }

    // 생성자 오버로딩 (== 생성자를 계속 쌓는다)
    Dancer(String dgenre) {
        dancerName = "관종킹";
        crewName = "써커스왕";
        genre = dgenre;
        level = DanceLevel.BEGINNER;
    }

    Dancer(String dName, String dGenre, DanceLevel dLevel) {
        dancerName = dName;
        crewName = "하하호호";
        genre = dGenre;
        level = dLevel;
//        필드 != (매개)변수
//        필드는 힙에 저장되고, 변수는 스택에 저장됨
    }

    // 기능 (메서드) : static을 붙이지 마세요~!
    // 춤추는 기능
    void dance() {
        System.out.println(genre + "춤을 열정적으로 춥니다.");
    }
    
    // 스트레칭을 하는 기능
    void stretch() {
        System.out.println("몸을 유연하게 풉니다");
    }

    // 자기소개 기능
    String introduce() {
        return String.format("내 이름은 %s이고, %s팀에 소속되어 있습니다.", dancerName, crewName);
//        printf는 리턴 불가 -> 리턴하고싶을 때 format() 사용
    }
    
}
