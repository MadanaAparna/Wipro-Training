package Day14;

import java.util.Scanner;

public class Lab8 {

		String fisrtName;
		String lastName;
		Gender gender;

		enum Gender { M, F };

		public Lab8() {

		}

		public Lab8(String fisrtName, String lastName, Gender gender) {
			this.fisrtName = fisrtName;
			this.lastName = lastName;
			this.gender = gender;
		}

		public String getFisrtName() {
			return fisrtName;
		}

		public void setFisrtName(String fisrtName) {
			this.fisrtName = fisrtName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Gender getGender() {
			return gender;
		}

		public void setGender(Gender gender) {
			this.gender = gender;
		}

		public String acceptPhoneNumber(String num) {
			return num;
		}
public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);

			Lab8 p1 = new Lab8();
			p1.setFisrtName("Aparna");
			p1.setLastName("Madana");
			Lab8.Gender g = Lab8.Gender.F;
			p1.setGender(g);
			
			System.out.println("Person Details");
			System.out.println("-----------------");
			System.out.println("FirstName: " + p1.getFisrtName());
			System.out.println("LastName: " + p1.getLastName());
			System.out.println("Gender: " + p1.getGender());

			System.out.println("Enter mobile number:");
			String acceptedNumber = sc.next();
			System.out.println("Mobile Number: " + acceptedNumber);

			sc.close();
		}
	}

