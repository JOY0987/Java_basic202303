package day08.poly;

import day09.musicManagement.Artist;

public class Main {

    public static void main(String[] args) {

        // 객체는 항상 역할에 의존해야지, 구현체에 의존하면 안됨
        // 사장이라면 알바들의 역할에 의존해야지, 알바생 한명에게만 의존하면 안됨
        Computer com = new Computer();

        LgMonitor lgMonitor = new LgMonitor();
        com.monitor = lgMonitor; // LgMonitor가 Computer의 자식객체이기 때문에 자동 형변환
        
        // 모니터 교환
        com.monitor = new HpMonitor(); // HpMonitor도 Computer의 자식객체이기 때문에 자동 형변환
    }
}
