package com.bootcoding.abstraction;

import java.awt.*;

abstract class World{
   abstract void start();
}
class Car extends World{
    void start(){
        System.out.println("Car Starts with key");
    }
}
class Bike extends Car{
    void start(){
        System.out.println("Bike Starts with Key");
    }
}
public class vehical {
    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        Bike b = new Bike();
        b.start();

    }

}
