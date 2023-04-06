package day09.quiz;

public abstract class SmartPhone implements Camera, PhoneCall, Touchable {

    private String model;

    public String information() {
        return
                String.format("%s에서 만들어졌고 제원은 다음과 같다.", this.getModel())
                + makeCall()
                + takeCall()
                + takePicture()
                + touchDisplay();
    }

    public String charge() {
        return "\n고속충전, 고속 무선 충전";
    }

    @Override
    public String makeCall() {
        return "\n번호를 누르고 통화버튼을 누름";
    };
    @Override
    public String takeCall() {
        return "\n전화받기 버튼을 누름";
    };

    @Override
    public String touchDisplay() {
        return "\n정전식";
    };

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
