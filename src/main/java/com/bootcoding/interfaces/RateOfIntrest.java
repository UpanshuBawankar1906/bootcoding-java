package com.bootcoding.interfaces;

interface I1{
    float intrest();
}
class HDFC implements I1{

    @Override
    public float intrest() {
        return 9.03f;
    }
}
class IDFC implements I1{
    public float intrest(){
        return 8.60f;
    }
}
public class RateOfIntrest {
    public static void main(String[] args) {
        I1 i = new HDFC();
        I1 e = new IDFC();

        System.out.println("Rate Of Intrest: "+ i.intrest());
        System.out.println("Rate Of Intrest: "+ e.intrest());
    }
}
