package com.example.foreverfind.model;

public class Order {


    private String orderNo;
    private String RecName;
    private String Daddress;
    private String ResPhone;
    private boolean status;

    public Order() {
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRecName() {
        return RecName;
    }

    public void setRecName(String recName) {
        RecName = recName;
    }

    public String getDaddress() {
        return Daddress;
    }

    public void setDaddress(String daddress) {
        Daddress = daddress;
    }

    public String getResPhone() {
        return ResPhone;
    }

    public void setResPhone(String resPhone) {
        ResPhone = resPhone;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
