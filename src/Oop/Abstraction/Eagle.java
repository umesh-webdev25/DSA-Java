package Oop.Abstraction;

public class Eagle extends Animal{
    @Override
    void flay() {
        System.out.println("Eagle can fly a few hundred kilometers in a day");
    }

    @Override
    void sound() {
        System.out.println("Eagle makes a screeching sound");
    }
}
