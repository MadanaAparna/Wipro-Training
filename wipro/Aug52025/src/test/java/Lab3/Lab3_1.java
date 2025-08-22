package Lab3;

import java.util.Scanner;
class NameNotValidException extends Exception {
 public NameNotValidException(String message) {
     super(message);
 }
}

public class Lab3_1 {
 private String firstName;
 private String lastName;
 private char gender;

 // Parameterized constructor with validation
 public Lab3_1(String firstName, String lastName, char gender) throws NameNotValidException {
     if (firstName == null || firstName.trim().isEmpty() ||
         lastName == null || lastName.trim().isEmpty()) {
         throw new NameNotValidException("First name and Last name cannot be blank!");
     }
     this.firstName = firstName;
     this.lastName = lastName;
     this.gender = gender;
 }

 // Method to display details
 public void displayDetails() {
     System.out.println("Full Name: " + firstName + " " + lastName);
     System.out.println("Gender: " + gender);
 }

 // Main method
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     try {
         System.out.print("Enter first name: ");
         String fName = sc.nextLine();

         System.out.print("Enter last name: ");
         String lName = sc.nextLine();

         System.out.print("Enter gender (M/F): ");
         char gender = sc.next().charAt(0);

         // Create object
         Lab3_1 person = new Lab3_1(fName, lName, gender);

         // Display details
         person.displayDetails();

     } catch (NameNotValidException e) {
         System.out.println("Error: " + e.getMessage());
     }
 }
}
