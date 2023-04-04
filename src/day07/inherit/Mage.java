package day07.inherit;

public class Mage extends Player {

    int mana; // 마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    // 썬더볼트
    public void thunderBolt() {
        System.out.println("썬더볼트를 사용합니다.");
    }

    // 오버라이딩
    @Override
    public void showStatus() {
        System.out.println("\n========= Character's status =========");
        System.out.println("# name : " + this.nickName);
        System.out.println("# level : " + this.level);
        System.out.println("# hp : " + this.hp);
        System.out.println("# mana : " + this.mana);
    }
}
