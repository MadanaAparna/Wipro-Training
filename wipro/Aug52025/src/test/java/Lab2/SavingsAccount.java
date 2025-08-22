package Lab2;

public class SavingsAccount extends Account2{
	private final double minimumBalance = 500.0;

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        if ((balance - amount) >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrawn from Savings: " + amount);
            return true;
        } else {
            System.out.println("Cannot withdraw: Minimum balance must be maintained (" + minimumBalance + ")");
            return false;
        }
    }
}