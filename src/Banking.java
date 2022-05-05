package src;

public class Banking {
    private String firstName;
    private String lastName;
    private double balance;
    private int typeOfAccount;

    public static final int CHECKING = 1;
    public static final int SAVIINGS = 2;

    public Banking(String firstName, String lastName, double balance, int typeOfAccount) {
        this.firstName = firstName;;
        this.lastName = lastName;
        this.balance = balance;
        this.typeOfAccount = typeOfAccount;
    }

 //Arguement true if customer is performing transaction at branch with teller.
 // Is false if customer is performing transaction at ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    public double withdraw(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isChecking() {
        return typeOfAccount == CHECKING;
    }
}