package com.bootcoding.inheritance;

public class Forest {
    void moves(){
        System.out.println("Animals are Moving.");
    }
}
class Cheeta extends Forest{
    void moves2(){
        System.out.println("Cheetah is running fast....");
    }
}
class Hungry extends Cheeta{
    void moves3(){
        System.out.println("Cheetah is on Hunting");
    }

    protected void moves4() {
        System.out.println("Cheeta is sleeping zzzz");
  }
}
class Sleep extends Hungry {
     public void moves4() {
       System.out.println("Cheetah is sleeping zzzz");
    }
    public static void main(String[] args) {
        Hungry H = new Hungry();
        H.moves();
        H.moves2();
        H.moves3();
        H.moves4();
        H.moves4();
    }
}
