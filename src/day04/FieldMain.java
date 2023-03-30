package day04;

public class FieldMain {

    public static void main(String[] args) {

        FieldAndLocal fl = new FieldAndLocal();
        System.out.println(fl.a); // 객체를 생성한 이후 a에 접근 가능

        fl.mm(100);
        /*
        a = 0
        b = 100
        c = 5
        */
    }
}
