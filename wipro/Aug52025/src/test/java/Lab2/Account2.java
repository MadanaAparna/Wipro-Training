package Lab2;

public class Account2 {
	protected String accountHolder;
    protected double balance;

    public Account2(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // This method will be overridden
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            return true;
        } else {
            System.out.println("Insufficient balance");
            return false;
        }
    }

    public void displayBalance() {
        System.out.println(accountHolder + "'s Balance: " + balance);
    }
}


