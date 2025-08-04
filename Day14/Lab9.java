package Day14;

import java.util.Scanner;

public class Lab9 {

	
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        System.out.print("Enter a string: ");
		        String input = sc.nextLine();

		        System.out.println("Choose operation:");
		        System.out.println("1 Add string to itself");
		        System.out.println("2 Replace odd positions with #");
		        System.out.println("3 Remove duplicate characters");
		        System.out.println("4 Change odd characters to uppercase");

		        int choice = sc.nextInt();
		        String result = "";

		        int i = 0;

		        switch (choice) {
		            case 1:
		                result = input + input;
		                break;

		            case 2:
		                while (i < input.length()) {
		                    if (i % 2 == 1)
		                        result += "#";
		                    else
		                        result += input.charAt(i);
		                    i++;
		                }
		                break;

		            case 3:
		                while (i < input.length()) {
		                    char c = input.charAt(i);
		                    if (result.indexOf(c) == -1)
		                        result += c;
		                    i++;
		                }
		                break;

		            case 4:
		                while (i < input.length()) {
		                    char c = input.charAt(i);
		                    if (i % 2 == 1)
		                        result += Character.toUpperCase(c);
		                    else
		                        result += c;
		                    i++;
		                }
		                break;

		            default:
		                System.out.println("Invalid choice");
		        }

		        System.out.println("Result: " + result);
		        sc.close();
		    }
			
			}	
	

		


