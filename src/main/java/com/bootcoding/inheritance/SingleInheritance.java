package com.bootcoding.inheritance;

public class SingleInheritance  {
   void showA(){
       System.out.println("This is showA");
    }
}
class B extends SingleInheritance{

    void showB(){
        System.out.println("This is showB");
    }

}

class C extends B{
    void showC(){
        System.out.println("This is showC");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.showC();
        obj.showA();
        obj.showB();
    }
}


