package day05.player;

// this -> '나의 또다른 생성자를 호출해주세요'
// this 를 통해 반복되는 코드를 줄일 수 있습니다.
// this 생성자 호출은 반드시 첫번째 구문에 있어야합니다.

public class Player {
    
    String nickName; // 캐릭터 닉네임
    
    int level; // 레벨

    int hp; // 체력

    // 생성자
    public Player() {
        this("이름없음");
        System.out.println("1번 생성자 호출!");
//        this.nickName = "이름없음";
//        this.level = 1;
//        this.hp = 50;
    }
    public Player(String nickName) {
        this(nickName, 1, 50);
//        this(nickName, 1); // 존재하지 않는 생성자 호출시 에러!
        System.out.println("2번 생성자 호출!");
    }

    public Player(String nickName, int level, int hp) {
        this.nickName = nickName;
        this.level = level;
        this.hp = hp;
    }
    /*Player(String nickName) {
        this.nickName = nickName; // 전달한 값을 나의 nickName으로 저장할게
        level = 1;
        hp = 50;
    }*/
    /*public Player(String nickName) {
        this.nickName = nickName;
        this.level = 1;
        this.hp = 50;
    }*/

    // 기능 - 메서드
    void levelUp(Player this) { // Player this를 지워도 this를 사용 가능!
    }

    void attack(Player target) { // 매개변수에 Player this가 생략되어있음!
        
        if (this == target) return; // 내가 나를 타겟팅하지 않도록
        
        System.out.println("target의 주소: " + target);
        System.out.println("this의 주소: " + this);

        // 맞은 녀석의 체력을 10~15 랜덤으로 감소시킬거임
        int damage = (int) (Math.random() * 6 + 10);
        target.hp -= damage;
        
        // 전투로그를 출력할거임
        // 가해자가 피해자를 공격해서 nnn의 피해를 입힘
        System.out.printf("%s님이 %s님을 공격해서 %d의 피해를 입힘!\n", this.nickName, target.nickName, damage);
        // this -> '나'
    }
}
