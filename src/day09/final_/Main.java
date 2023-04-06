package day09.final_;

public class Main {

    public static void main(String[] args) {

        Person kim = new Person("김철수"
                , "000111-31231234"
                , new BagPack(5, "샘소나이트")
        );
        kim.name = "김출수"; // 개명
//        kim.ssn = "011111-2222222"; // 주민번호는 final 필드
//        kim.bagPack = new BagPack(10, "기본");
    }
}
