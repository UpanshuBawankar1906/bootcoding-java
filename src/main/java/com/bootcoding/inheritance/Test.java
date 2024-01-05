package com.bootcoding.inheritance;

 class Animal {
    void eat() {
        System.out.println("I am eating");
    }
}

      class Dog extends Animal{
          void eat() {
              System.out.println("bone");
          }
    }
    class Cat extends Animal {
        void eat() {
            super.eat();
            System.out.println(" milk");
        }
    }
    public class Test{
        public static void main(String[] args) {
            Cat c = new Cat();
            c.eat();
        }

    }
