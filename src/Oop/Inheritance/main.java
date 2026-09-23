package Oop.Inheritance;

public class main {
    public static void main(String[] args) {
        app a = new app(101,
                "Umesh",
                "Java",
                "MCA",
                3);
        app b = new app(102,"Lala","C++","MCA",4);
        a.newStudent();
        b.oldStudent();
    }
}
