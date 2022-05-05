package src;

public class Banking {
    private String firstName;
    private String lastName;
    private double balance;

    public Banking(String firstName, String lastName, double balance) {
        this.firstName = firstName;;
        this.lastName = lastName;
        this.balance = balance;
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
}