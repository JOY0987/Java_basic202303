package day10.generic;

import day04.array.StringList;
import day09.musicManagement.Artist;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();

        BananaBasket bb = new BananaBasket();
        bb.setBanana(new Banana());
        Banana banana = bb.getBanana();
        
        // 과일이 여러개가 더 있으면 바구니를 하나하나 다 만들건가?
        // 사과 바구니를 만들어서 쓰지말고, 일단 바구니를 만든 다음에 어떤 과일의 바구니인지 정하기!
        // -> 인터페이스 사용

//        Basket apples = new Basket(); // 바구니 만들고, 사과만 담을 수 있게 함!
//        apples.setFruit(new Apple());
//        apples.setFruit(new Banana()); // 하지만 바나나도 담을 수 있는 문제

        // 제네릭을 사용해서 해결할 수 있음!!
        // Basket 클래스의 F 형이 Apple 로 바뀌는 효과
        Basket<Apple> apples = new Basket<>();
        apples.setFruit(new Apple());
//        apples.setFruit(new Banana()); // 바나나 못담음
        Apple fruit = apples.getFruit();

        // Basket 클래스의 F 가 Banana 로 바뀌는 효과
        Basket<Banana> bananas = new Basket<>();
        bananas.setFruit(new Banana());
//        bananas.setFruit(new Apple()); // 사과 못담음
        Banana fruit1 = bananas.getFruit();

        // ArrayList 도 같은 알고리즘
//        ArrayList<Integer> objects = new ArrayList<>();

        // String 배열 만들기
        MyList<String> sl = new MyList<>();
        sl.push("짬뽕");
        sl.push("짜장");
        sl.push("탕수육");
        System.out.println(sl); // [짬뽕, 짜장, 탕수육]

        // int 배열 만들기
        MyList<Integer> numbers = new MyList<>();
        numbers.push(1);
        numbers.push(2);
        numbers.push(3);
        System.out.println(numbers); // [1, 2, 3]

        // Artist 배열 만들기
        MyList<Artist> artists = new MyList<>();
        artists.push(new Artist("동방신기", new StringList("hug")));
    }
}
