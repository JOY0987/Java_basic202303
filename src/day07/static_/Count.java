package day07.static_;

public class Count {

    // 제한자(modifier)
    // 접근 제한자(Access) / 사용 제한자(Usage)
    public static int x; // 정적 필드 : 모든 객체가 공유
//                          static 필드가 저장되는 메모리 공간이 따로 존재함!
    public int y;        // 인스턴스 필드 : 객체별로 관리

    // 정적 메서드
    public static void m1() {
        System.out.println("static 메서드 호출!");
        // 필드 참조 (static 메서드 안에서는 static 필드만 참조가능!)
        System.out.println("x = " + x);
//        System.out.println("y = " + y);
        // this.y 와 같은데, this가 어떤 객체인지 모르는 상황
        // static 은 this 정보를 알 수가 없어서 호출 불가능!
        
        Count c3 = new Count();
        System.out.println("c3.y = " + c3.y); // 정확하게 주체를 알려주면 호출 가능
//        System.out.println("c4.y = " + c4.y);
    }
    // 인스턴스 메서드
    public void m2() {
        System.out.println("인스턴트 메서드 호출!");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        // 객체를 만들고 호출할 수 있기 때문에, 인스턴스 메서드는 this.가 누군지 알수밖에없음!
    }

}
