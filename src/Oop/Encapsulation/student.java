package Oop.Encapsulation;

public class student {
    private String name;
    private int age;

    public String getName(String name){
        this.name =name;
        return this.name;
    }

    public int getAge(int age){
        this.age = age;
        return this.age;
    }
}
