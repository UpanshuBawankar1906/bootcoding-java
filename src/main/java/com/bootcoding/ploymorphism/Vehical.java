package com.bootcoding.ploymorphism;
//Method Overriding

class Bike{
    void speed(int a){
        System.out.println("The speed of bike is 80kmph");
    }
}
class Car extends Bike{
    @Override
    void speed(int a) {
        super.speed(a);
        System.out.println("The speed of the car is 100kmph");
    }
}
class Bus extends Car{
    void speed(int a){
        super.speed(a);
        System.out.println("The speed of the bus is 70kmph");
    }
}
class Train extends Bus{
    @Override
    void speed(int a) {
        super.speed(a);
        System.out.println("The speed of the train oin 130kmph");
    }
}
public class Vehical {
    public static void main(String[] args) {
        Train t = new Train();
        t.speed(5);
    }
}
