package Lab3;

class AgeNotValidException extends Exception {
    public AgeNotValidException(String message) {
        super(message);
    }
}

public class Lab3_2 {

    private static class Person {
        private String name;
        private float age;

        public Person(String name, float age) throws AgeNotValidException {
            if (age <= 15) {
                throw new AgeNotValidException("Age must be above 15. Given: " + age);
            }
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + "}";
        }
    }

    private static class Account {
        private long accNum;
        private double balance;
        private Person accHolder;

        public Account(long accNum, double balance, Person accHolder) {
            this.accNum = accNum;
            this.balance = balance;
            this.accHolder = accHolder;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (balance - amount >= 500) {
                balance -= amount;
            } else {
                System.out.println("Withdrawal denied! Minimum balance of 500 must be maintained.");
            }
        }

        public double getBalance() {
            return balance;
        }

        @Override
        public String toString() {
            return "Account{" +
                    "accNum=" + accNum +
                    ", balance=" + balance +
                    ", accHolder=" + accHolder +
                    '}';
        }
    }

    public static void main(String[] args) {
        Person smith = null;
        Person kathy = null;

        try {
            smith = new Person("Smith", 20);
        } catch (AgeNotValidException e) {
            System.out.println("Error creating Smith: " + e.getMessage());
        }

        try {
            kathy = new Person("Kathy", 17); // 17 is valid (>15)
        } catch (AgeNotValidException e) {
            System.out.println("Error creating Kathy: " + e.getMessage());
        }

        if (smith != null) {
            Account acc1 = new Account(1001, 2000, smith);
            acc1.deposit(2000);
            System.out.println("Smith's Balance: " + acc1.getBalance());
            System.out.println(acc1);
        }

        if (kathy != null) {
            Account acc2 = new Account(1002, 3000, kathy);
            acc2.withdraw(200);
            System.out.println("Kathy's Balance: " + acc2.getBalance());
            System.out.println(acc2);
        }
    }
}
