package day04;

import java.util.Scanner;

public class StringCompare {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        String myName = new String(new char[] {'홍', '길', '동'});
//        String myName = new String("홍길동");
        String myName = "홍길동";
        String inputName = sc.nextLine();

        System.out.println("myName = " + myName);
        System.out.println("inputName = " + inputName);

        if (myName.equals(inputName)) {
            System.out.println("두 이름이 일치함!");
        } else {
            System.out.println("두 이름이 일치하지 않음!");
        }

        // String은 char배열의 주소값을 가지고있으므로 ==이 아니라 메서드로 비교해야한다.
        // equals() 메서드 알고리즘
        /*
        boolean equals (char[] s1, char[] s2) {
            // 배열의 길이가 다르면 false
            if (s1.length != s2.length) {
                return false;
            }
            for (int i = 0; i < s1.length; i++) {
                if (s1[i] != s2[i]) {
                    // 한글자라도 틀리면 false
                    return false;
                }
            }
            return true;
        }
        */

    }
}
