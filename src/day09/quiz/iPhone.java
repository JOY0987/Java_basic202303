package day09.quiz;

public class iPhone extends SmartPhone {

    @Override
    public String information() {
        return "\n아이폰은 " + super.information();
    }

    public iPhone(String model) {
        super.setModel(model);
    }

    @Override
    public String charge() {
        return super.charge();
    }

    @Override
    public String takePicture() {
        return "\n1200만, 1600만 트리플 카메라";
    }

}
