package day08.poly;

class A {}
class B extends A {}
class C extends A {}
class D extends B {}
class E extends C {}

public class Basic {

    // 타입 캐스팅의 원리
    // 자식 객체는 상속관계에 있는 상위 타입을 1사용할 수 있다.
    Object x1 = new A();
    A x2 = new B();
    A x3 = new C();
    A x4 = new D();
    A x5 = new E();

    void test() {

        int a = 10;
        double b = a;
        
        B x = new B();
        A z = x; // B보다 A가 큰 타입이기 때문에 대입 가능
//        C y = z;
    }
}
