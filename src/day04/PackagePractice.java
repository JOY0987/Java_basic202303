package day04;

// import는 package 밑에, 클래스 밖에 작성
//import fruit.Apple;
//import fruit.Banana;
//import fruit.Grape;

// 한 패키지에서 많은 파일을 참조해야할 때 사용
import fruit.*;
import fruit.warm.*;

import java.util.Scanner;

public class PackagePractice {

    public static void main(String[] args) {

        new Apple();

        Banana banana = new Banana();
        Grape grape = new Grape();

//        java.util.Scanner sc = new java.util.Scanner(System.in); Scanner의 생략전 문법
        Scanner sc = new Scanner(System.in);
//        new Dancer(); // 같은 패키지에 있으므로 day04. 이 생략
    }
}
