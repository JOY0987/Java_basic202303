package day06.modi.pac2;

import day06.modi.pac1.A;

public class C {
    void test() {
        A a = new A();  // public, 패키지가 달라졌으니 import 필요!
//        new A(11);      // default
//        new A("zzzz");  // private

        a.f1 = 10;     // public
//        a.f2 = 20;     // default
//        a.f3 = 30;     // private

        a.m1();        // public
//        a.m2();        // default
//        a.m3();        // private

//        B 클래스에 default 제한 -> B와 같은 패키지가 아니면 B 클래스의 객체조차 생성 불가!
//        B b = new B();
//        b.x1 = 1;
    }
}
