package Lab2;

public class Account {
		    private static long accCounter = 1000; // Auto-generated account number

	    private long accNum;
	    private double balance;
	    private Person accHolder;

	    private static final double MIN_BALANCE = 500.0;

	    public Account(double balance, Person accHolder) {
	        this.accNum = accCounter++;
	        if (balance >= MIN_BALANCE) {
	            this.balance = balance;
	        } else {
	            System.out.println("Initial deposit is less than minimum ₹500. Setting balance to ₹500.");
	            this.balance = MIN_BALANCE;
	        }
	        this.accHolder = accHolder;
	    }

	    // Deposit method
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited ₹" + amount + " to " + accHolder.getName());
	        }
	    }

	    // Withdraw method
	    public void withdraw(double amount) {
	        if (amount > 0 && (balance - amount) >= MIN_BALANCE) {
	            balance -= amount;
	            System.out.println("Withdrew ₹" + amount + " from " + accHolder.getName());
	        } else {
	            System.out.println("Withdrawal failed for " + accHolder.getName() + ". Minimum ₹500 balance required.");
	        }
	    }

	    public double getBalance() {
	        return balance;
	    }

	    public long getAccNum() {
	        return accNum;
	    }

	    public Person getAccHolder() {
	        return accHolder;
	    }

	    public void setAccHolder(Person accHolder) {
	        this.accHolder = accHolder;
	    }

	    @Override
	    public String toString() {
	        return "Account{AccNum=" + accNum + ", Balance=₹" + balance + ", Holder=" + accHolder + "}";
	    }
	}


