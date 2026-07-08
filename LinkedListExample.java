import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> cities = new LinkedList<>();

        cities.add("Bengaluru");
        cities.add("Hyderabad");
        cities.add("Chennai");

        System.out.println("Cities: " + cities);

        cities.remove("Hyderabad");

        System.out.println("After removing Hyderabad: " + cities);
    }
}
