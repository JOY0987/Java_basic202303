package day09.abs;

// 추상화
// 1. 객체 생성 불가
// 2. 메서드는 오버라이딩을 위한 껍데기 역할에 국한되도록 제한
public abstract class Pet {
    private String name; // 이름
    private String kind; // 종
    private int age; // 나이

    public Pet(String name, String kind, int age) {
        this.name = name;
        this.kind = kind;
        this.age = age;
    }

    // 오버라이딩을 위한 메서드
    public void takeNap() {

    }
    public void eat () {

    }
}
