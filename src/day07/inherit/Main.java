package day07.inherit;

public class Main {

    public static void main(String[] args) {

        Warrior w = new Warrior("주차왕파킹"); // 자식 객체 생성할 때 부모 객체도 숨겨서 같이 생성
        Mage m =new Mage("충격왕쇼킹");
        Hunter h = new Hunter("욕설왕퍼킹");
//        Player p = new Player();

        w.showStatus();
        m.showStatus();
        h.showStatus();
    }
}
