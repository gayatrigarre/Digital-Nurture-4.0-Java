package ecommerce;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Shoes", "Footwear"),
            new Product(103, "Keyboard", "Electronics"),
            new Product(104, "T-shirt", "Clothing")
        };
        System.out.print("Enter product name to search: ");
        String searchName = scanner.nextLine();
        Product linearResult = Linearsearch.searchByName(products, searchName);
        System.out.println("\nLinear Search Result:");
        System.out.println(linearResult != null ? linearResult : "Product not found");
        Product binaryResult = Binarysearch.searchByName(products, searchName);
        System.out.println("\nBinary Search Result:");
        System.out.println(binaryResult != null ? binaryResult : "Product not found");
        scanner.close();
    }
}
