package Project2;

public class Main {
    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.setId(1122);
        acc1.setBalance(1000.0);
        Account.setAnnualInterestRate(0.55);
        acc1.deposit(30);
        acc1.deposit(40);
        acc1.deposit(50);
        acc1.withdraw(5);
        acc1.withdraw(4);
        acc1.withdraw(2);
        System.out.println("Account1 ID: " + acc1.getId());
        System.out.println("Account1 Balance: " + acc1.getBalance());
        System.out.println("Annual Interest Rate: " + Account.getAnnualInterestRate());
        System.out.println("Account1 Date Created: " + acc1.getDateCreated());
    }
}