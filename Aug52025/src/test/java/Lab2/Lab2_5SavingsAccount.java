package Lab2;

public class Lab2_5SavingsAccount extends Lab2_5Account {
	private static final double MIN_BALANCE = 500;

    public Lab2_5SavingsAccount(long accNum, double balance, Person accHolder) {
        super(accNum, balance, accHolder);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawal successful: " + amount);
        } else {
            System.out.println("Withdrawal denied! Minimum balance of INR " + MIN_BALANCE + " must be maintained.");
        }
    }

}
