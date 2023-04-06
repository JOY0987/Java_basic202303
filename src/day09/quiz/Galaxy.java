package day09.quiz;

public class Galaxy extends SmartPhone implements Pencil {
    public Galaxy(String model) {
        super.setModel(model);
    }

    @Override
    public String information() {
        return "갤럭시는 " + super.information() + "\n블루투스 펜 탑재 여부: " + this.bluetoothPen();
    }

    @Override
    public String charge() {
        return super.charge();
    }

    @Override
    public String takePicture() {
        return "\n1300만 듀얼카메라";
    }

    @Override
    public boolean bluetoothPen() {
        return true;
    }

    @Override
    public String touchDisplay() {
        return super.touchDisplay() + ", 와콤펜 지원";
    }
}
