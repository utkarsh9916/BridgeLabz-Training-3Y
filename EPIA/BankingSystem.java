
/*

Description:
Create a banking system with different account types:

1. Define an abstract class BankAccount with fields like accountNumber, holderName, and balance.
2. Add methods like deposit(double amount) and withdraw(double amount) (concrete) and calculateInterest() (abstract).
3. Implement subclasses SavingsAccount and CurrentAccount with unique interest calculations.
4. Create an interface Loanable with methods applyForLoan() and calculateLoanEligibility().
5. Use encapsulation to secure account details and restrict unauthorized access.
6. Demonstrate polymorphism by processing different account types and calculating interest dynamically.
*/

import java.util.*;

// Interface
interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}

// Abstract Class
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    // Encapsulation
    public String getAccountNumber() { return accountNumber; }
    public String getHolderName() { return holderName; }
    public double getBalance() { return balance; }

    // Only internal update allowed
    protected void setBalance(double balance) {
        if(balance >= 0) {
            this.balance = balance;
        }
    }

    // Concrete methods
    public void deposit(double amount) {
        if(amount > 0) {
            setBalance(getBalance() + amount);
            System.out.println("Deposited: " + amount + ", New Balance: " + getBalance());
        }
    }

    public void withdraw(double amount) {
        if(amount > 0 && amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrew: " + amount + ", New Balance: " + getBalance());
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    // Abstract method
    public abstract double calculateInterest();

    // Concrete method
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

// Subclass: Savings Account
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.04; // 4% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Savings Account Loan applied for amount: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 5000; // Eligible if balance >= 5000
    }
}

// Subclass: Current Account
class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * 0.02; // 2% interest
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Current Account Loan applied for amount: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() >= 20000; // Eligible if balance >= 20000
    }
}

// Main Class
public class BankingSystem {
    public static void main(String[] args) {
        List<BankAccount> accounts = new ArrayList<>();

        SavingsAccount s1 = new SavingsAccount("S101", "Alice", 10000);
        CurrentAccount c1 = new CurrentAccount("C202", "Bob", 30000);

        accounts.add(s1);
        accounts.add(c1);

        // Polymorphism
        for(BankAccount acc : accounts) {
            acc.displayDetails();
            System.out.println("Interest: " + acc.calculateInterest());

            if(acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(50000);
                System.out.println("Loan Eligibility: " + loanAcc.calculateLoanEligibility());
            }

            System.out.println("-----------------------------");
        }
    }
}

