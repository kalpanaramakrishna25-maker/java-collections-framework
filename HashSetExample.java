import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {

        HashSet<String> colors = new HashSet<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Red"); // Duplicate value

        System.out.println("HashSet Elements: " + colors);

        colors.remove("Blue");

        System.out.println("After removing Blue: " + colors);
    }
}
