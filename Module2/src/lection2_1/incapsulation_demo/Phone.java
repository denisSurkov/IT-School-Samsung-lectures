package lection2_1.incapsulation_demo;

public class Phone {
    protected String mark, model, boxType, os;

    public Phone(){}

    public Phone(String mark, String model, String boxType, String os) {
        this.mark = mark;
        this.model = model;
        this.boxType = boxType;
        this.os = os;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void call(){}

    public void sendSMS(){}
}
