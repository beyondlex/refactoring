package ch7_ExtractClass;

public class Person {
    private String name;
    private TelephoneNumber telephoneNumber;

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber.getTelephoneNumber();
    }
}
class TelephoneNumber {
    private String areaCode;
    private String number;

    public String getTelephoneNumber() {
        return "(" + areaCode + ")" + number;
    }
    String getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
