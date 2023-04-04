package day07.inherit;

public class Hunter extends Player {

    int concentration; // 집중력

    public Hunter(String nickName) {
        super(nickName);
        this.concentration = 100;
    }

    public void summonBeast() {
        System.out.println("비스트를 시전합니다.");
    }

    // 오버라이딩


    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# concentration : " + this.concentration);
        summonBeast();
    }
}
