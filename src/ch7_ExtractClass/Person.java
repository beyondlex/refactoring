package ch7_ExtractClass;

public class Person {
    private String name;
    private String officeAreaCode;
    private String officeNumber;
    private TelephoneNumber telephoneNumber;

    public String getName() {
        return name;
    }

    public String getTelephoneNumber() {
        return "(" + getOfficeAreaCode() + ")" + officeNumber;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }

    public String getOfficeAreaCode() {
        return telephoneNumber.getAreaCode();
    }

    public void setOfficeAreaCode(String officeAreaCode) {
        telephoneNumber.setAreaCode(officeAreaCode);
    }
}
class TelephoneNumber {
    private String areaCode;
    String getAreaCode() {
        return areaCode;
    }
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }
}
