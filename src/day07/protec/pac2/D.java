package day07.protec.pac2;

import day07.protec.pac1.A;

public class D extends A {

    D() {
        super(10);
        // 다른 패키지의 protected는 상속을 통해 super 생성자로 접근이 가능
        // 다른 패키지의 default는 상속받아도 접근 불가능
        // 그래서 default는 실무에서 사용 ㄴㄴ
        // 완벽공개 public/중간 protected/완전차단 private
        f1 = 1;
//        f2 = 2;

        m1();
//        m2();
    }
}
