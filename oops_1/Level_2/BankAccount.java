package Assignment.OOPs_01.Level2;

// Program 2: Program to Simulate an ATM
// Problem Statement: Create a BankAccount class with attributes accountHolder,
// accountNumber, and balance. Add methods for:
// ● Depositing money.
// ● Withdrawing money (only if sufficient balance exists).
// ● Displaying the current balance.

class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Harshit", 12345, 5000);
        acc.displayBalance();
        acc.deposit(2000);
        acc.withdraw(3000);
        acc.displayBalance();
    }
}

