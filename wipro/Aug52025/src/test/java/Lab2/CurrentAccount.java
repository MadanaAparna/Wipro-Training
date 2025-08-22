package Lab2;

public class CurrentAccount extends Account2{
	private double overdraftLimit;

    public CurrentAccount(String accountHolder, double balance, double overdraftLimit) {
        super(accountHolder, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public boolean withdraw(double amount) {
        if (amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn from Current Account: " + amount);
            return true;
        } else {
            System.out.println("Overdraft limit exceeded");
            return false;
        }
    }
}

