package Lab2;

public class BankApp {
	public static void main(String[] args) {
	        SavingsAccount sa = new SavingsAccount("Aparna", 1000);
	        sa.displayBalance();
	        sa.withdraw(400);  // Should work
	        sa.withdraw(200);  // Should fail due to minimum balance
	        sa.displayBalance();

	        System.out.println("--------------");

	        CurrentAccount ca = new CurrentAccount("Madhu", 2000, 1000);
	        ca.displayBalance();
	        ca.withdraw(2500);  // Should work (within overdraft)
	        ca.withdraw(600);   // Should fail
	        ca.displayBalance();
	    }
	}

	


