import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student> {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Student s) {
        return this.id - s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class ComparableExample {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(103, "Sofia"));
        students.add(new Student(101, "Kalpana"));
        students.add(new Student(102, "Neha"));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
