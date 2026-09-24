package collections.module2.Set_Interface;

import java.util.Objects;

public class student {
    public int id;
    public String name;

    public student(String name, int id) {
        this.id = id;
        this.name = name;

    }

    @Override
    public String toString() {
        return "student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
