package com.bootcoding.encapsulation;

class Account{
    private long acc_no;
    private float deposit;
    private String email;
    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAcc_no(long acc_no) {
        this.acc_no = acc_no;
    }
    public long getAcc_no() {
        return acc_no;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }
    public double getDeposit() {
        return deposit;
    }
}
public class Bank {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.setName("Upanshu Bawankar");
        System.out.println("Name: " + acc.getName());
        acc.setAcc_no(547862319);
        System.out.println("Account Number: "+ acc.getAcc_no());
        acc.setEmail("619bawankarupanshu@gmail.com");
        System.out.println("Email: " + acc.getEmail());
        acc.setDeposit(24000f);
        System.out.println("Account Balance: " + acc.getDeposit());
    }
}
