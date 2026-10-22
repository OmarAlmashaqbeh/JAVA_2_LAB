package Project2;

import java.util.Date;

public class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private Date dateCreated;

    public Account() {
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double annualInterestRate) {
        Account.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    void withdraw(double amount) {
        if (amount < 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
    }
}