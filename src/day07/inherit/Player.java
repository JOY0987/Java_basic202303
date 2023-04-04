package day07.inherit;

// 수퍼 클래스 (부모 클래스) : 객체의 공통 기능과 속성을 설계
public class Player { // extends Object 생략 (자바가 자동으로 달아줌)
                      // 모든 자바 클래스는 상속을 받아야한다.

    // 공통 기능
    String nickName;
    int level;
    int hp;
    int exp;

    // 부모의 생성자
//    public Player() {
//        System.out.println("Player의 생성자 호출!");
//    }


    public Player(String nickName) {
//        super();
        System.out.println("Player의 생성자 호출!");
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }

    // 공통 메서드
    // 캐릭터 상태창을 보는 기능
    public void showStatus() {
        System.out.println("\n========= Character's status =========");
        System.out.println("# name : " + this.nickName);
        System.out.println("# level : " + this.level);
        System.out.println("# hp : " + this.hp);
    }
}
