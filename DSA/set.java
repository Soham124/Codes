package DSA;

import java.util.*;

public class set {
    public static void main(String[] args) {
        // Create a HashSet
        Set<String> fruits = new HashSet<>();

        // Add elements to the set
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate, will not be added

        // Display the set
        System.out.println("Fruits set: " + fruits);

        // Check if an element exists
        if (fruits.contains("Banana")) {
            System.out.println("Banana is in the set.");
        }

        // Remove an element
        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        // Iterate over the set
        System.out.println("Iterating over the set:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}