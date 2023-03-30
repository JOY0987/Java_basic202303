package day04.array;

// OOP : 클래스에 필드, 생성자, 메서드를 정규화해두고 필요할 때 갖다쓰는 객체지향 프로그래밍

public class Main {

    public static void main(String[] args) {

        StringList foodList = new StringList("제육볶음", "짬뽕");
        StringList userNameList = new StringList("홍길동");

        foodList.push("짜장면");
        foodList.push("볶음밥");
        foodList.push("탕수육");

        userNameList.push("김철수");
        userNameList.push("박영희");

        foodList.pop();
        userNameList.pop();

        foodList.clear();
        System.out.println("foodList 비었니?" + foodList.isEmpty());

        System.out.println("foodList = " + foodList);
        System.out.println("foodList.size() = " + foodList.size());
        System.out.println("userNameList = " + userNameList);
        System.out.println("userNameList.size() = " + userNameList.size());
    }
}
