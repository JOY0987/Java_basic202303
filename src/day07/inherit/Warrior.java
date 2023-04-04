package day07.inherit;

// 서브 클래스 (자식 클래스)
public class Warrior extends Player { // Warrior는 Player로 확장했다! (extends = is a)

    int rage; //분노 게이지

    public Warrior() {
        this("이름없음");
    }

    public Warrior(String nickName) {
        super(nickName); // 부모의 생성자를 부르는 메서드가 무조건 숨어있다!
//                          this()를 작성하면 부모 생성자를 사용할 수 없다.
        this.rage = 20;
    }

    // 파워슬래시
    public void powerSlash() {
        System.out.println("파워 슬래시를 시전합니다.");
    }
    
    // 오버라이딩 Ctrl+O
    // 조건: 부모의 시그니처(리턴타입, 이름, 파라미터)를 똑같이 사용
    //      접근제한자는 무조건 '부모보다' public해야 함.
    @Override // 오버라이딩이 올바른지 검사
    public void showStatus() {
        /*
        System.out.println("\n========= Character's status =========");
        System.out.println("# name : " + this.nickName);
        System.out.println("# level : " + this.level);
        System.out.println("# hp : " + this.hp);
        => 부모 클래스의 showStatus()
        */
        super.showStatus();
        System.out.println("# rage : " + this.rage);
    }
}
