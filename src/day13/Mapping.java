package day13;

import java.util.List;
import java.util.stream.Collectors;

import static day07.Util.Utility.*;
import static day13.Menu.menuList;
import static java.util.stream.Collectors.*;

public class Mapping {

    public static void main(String[] args) {

        // stream 의 map: 리스트에서 원하는 정보만 추출

        // 메뉴 목록에서 요리의 이름들만 목록으로 추출
        List<String> dishNames = menuList.stream()
                .map(dish -> dish.getName())
                .collect(Collectors.toList());

        System.out.println("dishNames = " + dishNames);

        makeLine();

        List<String> words = List.of(
                "safari", "chrome", "ms edge"
                , "opera", "firefox"
        );

        List<Integer> wordLengths = words.stream()
                .map(w -> w.length())
                .collect(Collectors.toList());

        System.out.println("wordLengths = " + wordLengths);

        makeLine();


        // 메뉴 목록에서 메뉴이름과 칼로리를 추출하는데
        // 칼로리를 정수가 아닌 문자열로 kcal 을 뒤에 붙여서 추출 후
        // 메뉴이름: ~kcal 로 반복 출력하고 싶음
        List<SimpleDish> simpleDishes = menuList.stream()
                .map(dish -> new SimpleDish(dish))
                .collect(toList());

//        람다로 바꾸기 전 원래 형태!
//        map(new Function<Dish, SimpleDish>() {
//            @Override
//            public SimpleDish apply(Dish dish) {
//                SimpleDish sd
//                        = new SimpleDish(
//                        dish.getName(),
//                        dish.getCalories() + "kcal");
//
//                return sd;
//            }
//        })


        System.out.println(simpleDishes);

        makeLine();

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.
         */
        menuList.stream()
                .filter(dish -> dish.getCalories() > 500)
                .map(dish -> new DishNameType(dish))
                .collect(toList())
                .forEach(dnt -> System.out.println(dnt));
        
        makeLine();
        
        // 메뉴 목록에 있는 요리들의 총 칼로리수 구하기
        int totalCal = menuList.stream()
                .mapToInt(d -> d.getCalories())
                .sum();
        System.out.println("totalCal = " + totalCal);

        // 육류 메뉴의 평균 칼로리 구하기
        double averageCal = menuList.stream()
                .filter(d -> d.getType() == Dish.Type.MEAT)
                .mapToInt(d -> d.getCalories())
                .average()
                .getAsDouble();// OptionalDouble 로 리턴되는 걸 변환해주는 역할!
        System.out.println("averageCal = " + averageCal);
    }

}
