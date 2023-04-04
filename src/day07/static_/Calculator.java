package day07.static_;

public class Calculator {
    
    String color; // 계산기 색깔
    static double pi; // 원주율 : 하나만 만들어서 돌려쓸 수 있는 데이터 -> static

    double calcAreaCircle(int r) { // 객체 굳이 안 만들고 호출할만한 메서드 -> static
        return pi * r * r;
    }

    // 계산기에 색칠을 예쁘게 칠하는 기능
    void paint (String color) {
        this.color = color;
    }
}
