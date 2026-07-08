import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Kalpana");
        students.put(102, "Neha");
        students.put(103, "Sofia");

        System.out.println("Student List: " + students);

        System.out.println("Student with ID 101: " + students.get(101));

        students.remove(102);

        System.out.println("After removing ID 102: " + students);
    }
}
