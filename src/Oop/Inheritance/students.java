package Oop.Inheritance;

public class students {
    public int id;
    public String name;
    public String subject;
    public String branch;
    public int sem;

    students(int id, String name , String subject, String branch, int sem){
        this.id = id;
        this.branch = branch;
        this.name = name;
        this.subject = subject;
        this.sem = sem;
    }

    public void newStudent(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(branch);
        System.out.println(subject);
        System.out.println(sem);
    }

    public void oldStudent(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(branch);
        System.out.println(subject);
        System.out.println(sem);
    }
}
