package Lab3;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of products
        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        String[] products = new String[n];

        // Taking product names
        System.out.println("Enter product names:");
        for (int i = 0; i < n; i++) {
            products[i] = sc.nextLine();
        }

        // Sorting product names
        Arrays.sort(products);

        // Display sorted products
        System.out.println("\nProducts in Sorted Order:");
        for (String product : products) {
            System.out.println(product);
        }

        sc.close();
    }
}
