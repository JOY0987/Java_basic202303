package day10.collection.map;

import day08.poly.car.Stinger;
import day09.musicManagement.Artist;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static day07.Util.Utility.makeLine;

public class MapExample {

    public static void main(String[] args) {
        // List, Set 과 달리 Collection 을 상속받고있지 않다.
        // Key 는 보통 문자열! 숫자를 쓸거면 인덱스가 Key 인 List 를 쓰는게 낫당

//        Map<String, List<Artist>> artists = new HashMap<>(); ~아티스트 장르별로 배열 만들기~ 이런 구조도 가능!
        Map<String, Object> map = new HashMap<>();

        // put(K, V) : 데이터 추가
        map.put("지갑잔액", 5000);
        map.put("좋아하는 가수", new Artist("르세라핌", null));
        map.put("저녁메뉴", "볶음밥");

        System.out.println(map.size()); // Entry 의 개수

        // get(key) : 데이터 참조
//        Object dinner = map.get("저녁메뉴"); // object 타입 데이터 반환
        String dinner = (String) map.get("저녁메뉴"); // 다운캐스팅
        System.out.println("dinner = " + dinner);

        Artist artist = (Artist) map.get("좋아하는 가수");
        artist.info();

        System.out.println(map);

        // 이미 존재하는 키에 또 put() => 수정!
        map.put("저녁메뉴", "짬뽕");
        System.out.println("map = " + map);

        // 반복문 처리
        for(String key : map.keySet()) {
            System.out.println("key = " + key);
            System.out.println("value = " + map.get(key));
            makeLine();
        }

    }
}
