package day07.static_;

import day07.Util.Utility;

// static 필드와 메서드를 그냥 참조 가능
import static day07.Util.Utility.*;
import static java.lang.System.*;


public class Main {

    public static void main(String[] args) {

        out.println(Count.x); // static 필드는 객체를 만들기 전에 참조가 가능
        out.println(Math.random());

        Count.m1();

        Count c1 = new Count();
        Count c2 = new Count();

        c2.m2();

        Count.x = 10;
        c2.y = 20;

        Count.x++;

        out.printf("c1 = x: %d, y: %d\n", c1.x, c1.y);
        out.printf("c2 = x: %d, y: %d\n", c2.x, c2.y);

//        Calculator c1 = new Calculator();
//        Calculator c2 = new Calculator();


        makeLine();
        makeLine();
        makeLine();
        input("static은 주체 떼고 쓰기 가넝!");
    }
}
