package Lab2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Lab15 {
	public static int calculateAge(LocalDate dob) {
        LocalDate currentDate = LocalDate.now();
        return Period.between(dob, currentDate).getYears();
    }

    // Method to return full name
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first name and last name
        System.out.print("Enter First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        String lastName = scanner.nextLine();

        // Input date of birth
        System.out.print("Enter Date of Birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobInput);

        // Get full name and age
        String fullName = getFullName(firstName, lastName);
        int age = calculateAge(dob);

        // Display details
        System.out.println("\n--- Person Details ---");
        System.out.println("Full Name: " + fullName);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Age: " + age + " years");

        scanner.close();
    }

}
