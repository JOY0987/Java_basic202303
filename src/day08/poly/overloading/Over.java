package day08.poly.overloading;

/*
    오버라이딩: 부모클래스의 메서드를 자식이 재정의하는 것
    오버로딩: 하나의 클래스 안에서 같은 이름의 메서드를 여러 개 선언하는 것
        조건: 반드시 매개변수의 타입 or 순서 or 개수가 달라야 한다.
             리턴타입과 접근제한자는 관련이 없다.
             => 메서드 이름과 파라미터만 보기
*/
public class Over {

    // 데이터를 전달하면 데이터의 타입을 알려주는 기능

    // alertType(String) -> 이제 못만듦
    void alertType(String s) {
        System.out.println("전달된 데이터는 문자열입니다.");
    }
    // alertType(int)
    void alertType(int x) {
        System.out.println("전달된 데이터는 정수입니다.");
    }
    // alertType(int, int)
    void alertType(int x, int y) {

    }
    // alertType(int, String)
    void alertType(int x, String y) {

    }
    // 위와 순서가 다름. 이런 경우에도 다르게 인식!
    void alertType(String y, int x) {

    }
    
    // 사용자는 alertType의 기능만 알고 있으면 파라미터의 변화를 통해 여러 함수를 사용할 수 잇슴
    void test() {
        alertType("zzz", 10);
        System.out.println(); // println도 오버로딩의 예
    }

}
