package day07.Util;

import java.util.Scanner;

public class Utility {

    public static Scanner sc = new Scanner(System.in);
    // 구분선을 출력하는 기능
    public static void makeLine() {
        System.out.println("==========================");
    }

    // 문자열을 입력받는 기능
    public static String input(String message) {
        System.out.print(message);
        return sc.nextLine();
    }

    public static void stop() {
        System.out.println("\n======= 엔터를 눌러서 계속.. ======");
        sc.nextLine();
    }
}
