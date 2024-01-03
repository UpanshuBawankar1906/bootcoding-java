package com.bootcoding.ploymorphism;
// Method Overriding

class SBI{
      void RateOfInterest(){
        System.out.println("The rate of interest is 8");
    }
}
class ICICI extends SBI{
    @Override
     void RateOfInterest() {
        System.out.println("The rate of interest is 9");
    }
}
class HDFC extends ICICI{
    @Override
     void RateOfInterest() {
        System.out.println("The rate of interest is 9.3");
    }
}

public class Bank extends HDFC{
    public static void main(String[] args) {


        ICICI i = new ICICI();
        i.RateOfInterest();
        SBI s = new SBI();
        s.RateOfInterest();
        HDFC h = new HDFC();
        h.RateOfInterest();


    }
}
