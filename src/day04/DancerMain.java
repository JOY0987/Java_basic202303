package day04;

// 실행용 클래스
// 여기엔 설계를 하지 않고 main메서드를 작성합니다.
public class DancerMain {

    public static void main(String[] args) {

        Dancer kim = new Dancer(); // 메서드 안에 있으니 kim은 변수! 필드 ㄴㄴ
        Dancer park = new Dancer("스트릿댄스");
        Dancer jang = new Dancer("장동견", "목각댄스", DanceLevel.PRO);

        Singer sing = new Singer();
        // new ~ : 변수 하나에 넣을 수 없으니까 큰 방 빌려줘

        System.out.println(kim); // day04.Dancer@58ceff1 주소값 출력
        System.out.println(park); // day04.Dancer@7c30a502

//        kim.dancerName = "김관종";
//        kim.crewName = "서커스크루";
        // 이렇게 main에서 대입하는게 아니고, 설계도에서 생성자를 통해 값을 대입해서 리턴해줘야함.
        
        System.out.println(kim.introduce());
        System.out.println(park.introduce());
        System.out.println(jang.introduce());


        kim.dance();
        park.dance();
        jang.dance();
    }
}
