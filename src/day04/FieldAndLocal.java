package day04;

public class FieldAndLocal {
    
    int a;  // 필드, 0이 기본값으로 대입되어있어서 초기화 필수 ㄴㄴ
    double[] b; // null 기본값
    
    void mm (int b) {   // b: 매개변수
                        // 메서드 호출시 매개변수를 대입해야하므로 초기화 필수 ㄴㄴ
        int c;  // c: 지역변수
        
        // 지역변수의 값은 꼭 초기화 해줘야 함
        if (a > 10) {
            c = 99;
        } else if (a < 5) {
            c = -100;
        } else {
            c = 55;
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
