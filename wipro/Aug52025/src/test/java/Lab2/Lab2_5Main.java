package Lab2;

public class Lab2_5Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person smith = new Person("Smith", 30);
        Person kathy = new Person("Kathy", 25);

        Lab2_5SavingsAccount smithAcc = new Lab2_5SavingsAccount(1001, 2000, smith);
        Lab2_5SavingsAccount kathyAcc = new Lab2_5SavingsAccount(1002, 3000, kathy);

        smithAcc.deposit(2000); // Deposit 2000 to Smith
        smithAcc.withdraw(2000); // Withdraw 2000 from Smith

        kathyAcc.withdraw(2000); // Withdraw 2000 from Kathy

        System.out.println(smithAcc);
        System.out.println(kathyAcc);

	}

}
