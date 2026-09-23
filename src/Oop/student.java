package Oop;

public class student {
    public int id;
    public int age;
    public int subject;
    public String name;

    public student(){
        System.out.println("Is is defualt Controctor...");

    }
    public student(int Sid , int Sage, int Ssubject, String Sname){
        System.out.println("Is is Paramerize Controctor...");
        this.id = Sid;
        this.age = Sage;
        this.subject = Ssubject;
        this.name = Sname;
    }

    public student(student S){
        System.out.println("Is is Copy Controctor...");
        this.id = S.id;
        this.age = S.age;
        this.subject = S.subject;
        this.name = S.name;
    }

    public void function(){
        System.out.println("Method inside the class");
    }

}
