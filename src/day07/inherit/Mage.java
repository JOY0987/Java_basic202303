package day07.inherit;

import static day07.Util.Utility.makeLine;
import static java.lang.Math.random;

public class Mage extends Player {

    int mana; // 마력 게이지

    public Mage(String nickName) {
        super(nickName);
        this.mana = 100;
    }

    // 썬더볼트
    public void thunderBolt(Player... targets) {
        System.out.printf("# %s님이 썬더볼트를 시전합니다.", nickName);
    }

    @Override
    public void attack(Player... targets) {
        System.out.printf("# %s님 썬더볼트 시전!!!\n", this.nickName);
        super.attack(targets);
    }

    // 오버라이딩
    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# mana : " + this.mana);
        thunderBolt();
    }
}
