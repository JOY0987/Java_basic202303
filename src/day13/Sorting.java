package day13;

import java.util.Comparator;

import static day07.Util.Utility.makeLine;
import static day13.Menu.menuList;
import static java.util.stream.Collectors.*;

public class Sorting {

    public static void main(String[] args) {

        // stream 의 정렬 sorted
        
        // 메뉴 목록 중 칼로리가 낮은 순으로 정렬
        menuList.stream()
                .sorted(Comparator.comparing(d -> d.getCalories()))
                .collect(toList())
                .forEach(d -> System.out.println(d));

        makeLine();

        // 메뉴 목록 중 이름으로 내림차 정렬 (zyx 순)
        menuList.stream()
                .sorted(Comparator.comparing(Dish::getName).reversed())
                .collect(toList())
                .forEach(d -> System.out.println(d));


        makeLine();

        // 원하는 개수만 필터링하기
        // 칼로리가 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        menuList.stream()
                .filter(d -> d.getCalories() > 300)
                .sorted(Comparator.comparing(Dish::getCalories).reversed())
                .limit(3) // 앞에서부터 3개 추출
                .collect(toList())
                .forEach(d -> System.out.println(d));

    }
}
