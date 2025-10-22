
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> Fruits = new ArrayList<>();

        Fruits.add("Apple");
        Fruits.add("Banana");
        Fruits.add("Orange");
        Fruits.add("Grape");
        System.out.println("Initial List: " + Fruits);

        System.out.println("First Index: " + Fruits.get(0));

        Fruits.remove("Banana");
        System.out.println("List After Removing 'Banana': " + Fruits);

        Fruits.add("Pineapple");
        Fruits.add("Mango");
        System.out.println("List After Adding more Fruits: " + Fruits);

        System.out.println("Fruits List:");
        for (String Fruit : Fruits) {
            System.out.println("-" + Fruit);
        }

        System.out.println("Total Number Of Fruits: " + Fruits.size());

    }
}
