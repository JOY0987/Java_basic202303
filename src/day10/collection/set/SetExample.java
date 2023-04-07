package day10.collection.set;

import java.util.*;

/*
    - 집합 자료구조
    - 저장순서를 보장하지 않음
    - 인덱스, 키를 사용하지 않아서 개별 탐색이 불리함
    - 저장값의 중복을 허용하지 않음
* */
public class SetExample {

    public static void main(String[] args) {

        Set<String> foodSet = new HashSet<>();
        
        // add(E e) : 데이터 추가
        // 논리값을 리턴하기 때문에 중복인지 아닌지 확인도 가능함!
        boolean flag1 = foodSet.add("김말이");
        foodSet.add("닭꼬치");
        foodSet.add("단무지");
        boolean flag2 = foodSet.add("김말이");
        foodSet.add("김밥");

        System.out.println(foodSet.size()); // 4
        System.out.println(foodSet);

        System.out.println("flag1 = " + flag1); // 첫번째 김말이가 add => true
        System.out.println("flag2 = " + flag2); // 두번째 중복 김말이가 add => false

        for (String food : foodSet) {
            System.out.println("food = " + food);
        }

        // remove(obj) : 삭제
        foodSet.remove("단무지");
        System.out.println("foodSet = " + foodSet);

        List<Object> numbers = new ArrayList<>(
                Arrays.asList(1, 1, 1, 3, 3, 5, 7, 9, 9)
        );
        
        // 리스트를 SET으로 변환
        // 데이터 중복 제거에 탁월~
        Set<Object> numberSet = new HashSet<>();
        numberSet.addAll(numbers);
        System.out.println("numberSet = " + numberSet);

    }
}
