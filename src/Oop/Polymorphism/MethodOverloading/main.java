package Oop.Polymorphism.MethodOverloading;

public class main {
    public static void main(String[] args) {
        method m =new method();
        System.out.println(m.sub(12,3));
        System.out.println(m.sum(12,3));
        System.out.println(m.sum(12,3,7));
    }
}
