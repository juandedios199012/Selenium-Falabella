package model;

public class Product {

    private String word;
    private String product;
    private String department;
    private String province;
    private String neighborhood;
    private String address;
    private String departmentNumber;
    private String giftCardNumber;
    private String password;
    private String alert;

    public String getWord() {
        return word;
    }

    public String getProduct() {
        return product;
    }

    public String getDepartment() {
        return department;
    }

    public String getProvince() {
        return province;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public String getAddress() {
        return address;
    }

    public String getDepartmentNumber() {
        return departmentNumber;
    }

    public String getGiftCardNumber() {
        return giftCardNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getAlert() {
        return alert.trim();
    }
}
