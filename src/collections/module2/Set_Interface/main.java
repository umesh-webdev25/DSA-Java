package collections.module2.Set_Interface;
import java.util.*;
public class main {
    public static void main(String[] args) {
        Set<student> set = new HashSet<>();
        student s1 = new student("lala", 1);
        student s2 = new student("lala", 1);
        student s3 = new student("lala", 1);
        set.add(s1);
        set.add(s2);
        set.add(s3);
        System.out.println(set);
    }
}
