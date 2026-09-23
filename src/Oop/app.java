package Oop;

public class app {
    public static void main(String[] args) throws Exception{
     student d = new student();
     d.id = 1;
     d.name = "Lala";
     d.age = 23;
     d.subject = 6;
        System.out.println("Student Id = "+d.id);
        System.out.println("Student Name = "+d.name);
        System.out.println("Student Age = "+d.age);
        System.out.println("Subject's = "+d.subject);
        d.function();
        System.out.println();

        student s = new student(1,23,6,"Lala");
        System.out.println("Student Id = "+s.id);
        System.out.println("Student Name = "+s.name);
        System.out.println("Student Age = "+s.age);
        System.out.println("Subject's = "+s.subject);
        s.function();
        System.out.println();

        student b = new student(s);
        System.out.println("Student Id = "+b.id);
        System.out.println("Student Name = "+b.name);
        System.out.println("Student Age = "+b.age);
        System.out.println("Subject's = "+b.subject);
        b.function();
    }
}
