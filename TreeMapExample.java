import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {

        TreeMap<Integer, String> students = new TreeMap<>();

        students.put(103, "Sofia");
        students.put(101, "Kalpana");
        students.put(102, "Neha");

        System.out.println("Student List: " + students);

        System.out.println("Student with ID 101: " + students.get(101));

        students.remove(102);

        System.out.println("After removing ID 102: " + students);
    }
}
