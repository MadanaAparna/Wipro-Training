package Lab2;

public abstract class Lab2_5Account {
	private long accNum;
    protected double balance;
    private Person accHolder;

    // Constructor
    public Lab2_5Account(long accNum, double balance, Person accHolder) {
        this.accNum = accNum;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    public long getAccNum() {
        return accNum;
    }
    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public Person getAccHolder() {
        return accHolder;
    }
    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    // Abstract withdraw method
    public abstract void withdraw(double amount);

    @Override
    public String toString() {
        return "Account Number: " + accNum + ", Balance: " + balance + ", Account Holder: " + accHolder;
    }

}
