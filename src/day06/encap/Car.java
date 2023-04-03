package day06.encap;

public class Car {

    // 필드 : 필드에 다이렉트로 접근하는 건 굉장히 위험! private 붙이는게 자바빈의 관례
    private String model;   // 모델명
    private int speed;      // 현재 속도
    private char mode;      // 변속 모드 (D, N, R, P)
    private boolean start;  // 시동 온오프 상태

    // 생성자 : 객체가 처음 생성될 때 상태
    // TIP) 어떤 필드가 값이 고정되어있고, 어떤 필드가 매번 값이 바뀌어야하는지 캐치
    // 매번 값이 바뀌는 필드를 생성자의 매개변수로 넣어주기!
    public Car(String model) {
        this.model = model;
        this.mode = 'P';
    }

    // setter : 필드값을 제어하기 위한 메서드
    //          public으로 접근 풀어주기
    //          값은 set으로 설정해라.. 필드에 바로 접근하지말고
    public void setSpeed(int speed) {
        if (speed <  0 || speed > 200) return; // 이상한 값이면 저장 안해줌 ㅋㅋ (데이터 보호)
        this.speed = speed; // 위의 값 아니면 저장해줄게
    }

    // getter: 필드값을 참조하기 위한 메서드
    public int getSpeed() {
        return this.speed;
        // 필드에는 km로 저장되어 있는데
        // mile로 변환해서 줘야함. or 값 앞에 * 붙여서 갖다주고싶음.
        // 이런 경우에도 getter에서 처리하기!
    }
    
//    setter, getter는 사용안해도 만들어주는 것이 관례! (Alt + Insert)
//    초기값을 바꾸고 싶지 않을 경우 setter 지워도 됨
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public char getMode() {
        return mode;
    }

    public void setMode(char mode) {
        switch (mode) {
            case 'D': case 'R': case 'N': case 'P':
                this.mode = mode;
                break;
            default:
                this.mode = 'P';
        }
    }

    public boolean isStart() {
        return start;
    }

    public void setStart(boolean start) {
        this.start = start;
    }


    // 캡슐화
    // 캡슐 외의 메서드들은 private로 은닉

    // 엔진에 연료가 주입되는 기능
    private void inject() {
        System.out.println("연료가 주입됩니다.");
    }

    // 엔진오일이 순환하는 기능
    private void putOil() {
        System.out.println("엔진오일이 순환합니다.");
    }
    
    // 엔진 실린더가 움직이는 기능
    private void moveCylinder() {
        if (start) {
            System.out.println("실린더가 움직입니다.");
        } else {
            System.out.println("차가 폭발합니다!!");
        }
    }
    
    // 시동버튼을 누르는 기능
    public void pressButton() {
        this.start = true;
        inject();
        putOil();
        moveCylinder(); // pressButton 이라는 캡슐 안에서 작동 순서를 정해주는 것
        System.out.println("시동이 걸렸습니다.");
    }

}
