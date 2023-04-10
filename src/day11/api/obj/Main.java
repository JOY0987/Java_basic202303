package day11.api.obj;

import day11.api.obj.Company;
import day11.api.obj.Pen;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Pen p1 = new Pen(123, "빨강", 1000);
        p1.company = new Company("모나미", "서울");

        Pen p2 = new Pen(123, "빨강", 1000);

        System.out.println(p1.toString()); // Object 의 메서드 toString

        // equals 재정의
        // Set에 저장할 때 중복을 제거해주는 효과가 있음
        System.out.println(p1 == p2); // false 주소가 다르잖아
        System.out.println(p1.equals(p2)); // true

        Set<Pen> penSet = new HashSet<>();

        penSet.add(p1);
        penSet.add(p2);

        System.out.println(penSet.size());
        System.out.println(penSet);

        // p1, p2의 해시코드값이 다름 (다른 객체로 본다는 말)
        // equals, hashcode 재정의 후에는 같은 주소값을 가짐!
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
