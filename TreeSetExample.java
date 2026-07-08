import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("Kalpana");
        names.add("Anu");
        names.add("Rahul");
        names.add("Divya");

        System.out.println("TreeSet Elements: " + names);

        names.remove("Rahul");

        System.out.println("After removing Rahul: " + names);
    }
}
