package day08.poly;

public class Main {

    public static void main(String[] args) {

        // 객체는 항상 역할에 의존해야지, 구현체에 의존하면 안됨
        // 사장이라면 알바들에 의존해야지, 알바생 한명에게만 의존하면 안됨
        Computer com = new Computer();

        LgMonitor lgMonitor = new LgMonitor();
        com.monitor = lgMonitor;
        
        // 모니터 교환
        com.monitor = new HpMonitor();
    }
}
