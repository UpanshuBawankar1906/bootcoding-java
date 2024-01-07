package com.bootcoding.mobile.brands;
public class Survey {
    int area_no;
    String area_name;
    Mobile [] mobile;
    User [] user;
    public int getArea_no() {
        return area_no;
    }
    public void setArea_no(int area_no) {
        this.area_no = area_no;
    }
    public String getArea_name() {
        return area_name;
    }
    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }
    public Mobile[] getMobile() {
        return mobile;
    }
    public void setMobile(Mobile[] mobile) {
        this.mobile = mobile;
    }
    public User[] getUser() {
        return user;
    }
    public void setUser(User[] user) {
        this.user = user;
    }
}
