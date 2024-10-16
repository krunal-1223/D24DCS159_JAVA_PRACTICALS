import java.util.Arrays;

public class pr39 {
    
    // Generic method to sort an array of Comparable objects
    public static <T extends Comparable<T>> void sortArray(T[] array) {
        // Sort the array using the built-in Arrays.sort method
        Arrays.sort(array);
    }

    // Main method to demonstrate sorting of different Comparable types
    public static void main(String[] args) {
        // Example 1: Sorting an array of Integers
        Integer[] intArray = {5, 2, 9, 1, 3};
        System.out.println("Before sorting integers: " + Arrays.toString(intArray));
        sortArray(intArray);
        System.out.println("After sorting integers: " + Arrays.toString(intArray));
        
        // Example 2: Sorting an array of Strings
        String[] strArray = {"Banana", "Apple", "Orange", "Mango"};
        System.out.println("\nBefore sorting strings: " + Arrays.toString(strArray));
        sortArray(strArray);
        System.out.println("After sorting strings: " + Arrays.toString(strArray));

        // Example 3: Sorting an array of custom Comparable objects (e.g., Products)
        Product[] productArray = {
            new Product("Laptop", 1000),
            new Product("Phone", 500),
            new Product("Tablet", 750)
        };
        System.out.println("\nBefore sorting products by price: " + Arrays.toString(productArray));
        sortArray(productArray);
        System.out.println("After sorting products by price: " + Arrays.toString(productArray));
    }
}

// Example of a Product class implementing Comparable
class Product implements Comparable<Product> {
    private String name;
    private int price;

    // Constructor
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // Compare products by price (natural ordering)
    @Override
    public int compareTo(Product other) {
        return Integer.compare(this.price, other.price);
    }

    // ToString method for easy printing
    @Override
    public String toString() {
        return name + " ($" + price + ")";
    }
}
