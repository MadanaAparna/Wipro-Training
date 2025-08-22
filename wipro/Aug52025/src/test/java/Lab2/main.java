package Lab2;

public class main {

	public static void main(String[] args) {
		// a) Create accounts
        Person smith = new Person("Smith", 30.0f);
        Account smithAccount = new Account(2000, smith);

        Person kathy = new Person("Kathy", 28.0f);
        Account kathyAccount = new Account(3000, kathy);

        // b) Deposit ₹2000 to Smith's account
        smithAccount.deposit(2000);

        // c) Withdraw ₹2000 from Kathy's account
        kathyAccount.withdraw(2000);

        // d) Display updated balances
        System.out.println("\n--- Updated Account Details ---");
        System.out.println(smithAccount);
        System.out.println(kathyAccount);
    }
}
