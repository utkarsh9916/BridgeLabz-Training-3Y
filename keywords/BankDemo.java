class BankAccount {
    private static String bankName = "SBI";  // Static variable
    private static int totalAccounts = 0;

    private String accountHolderName;
    private final int accountNumber; // Final variable

    // Constructor using 'this' to resolve ambiguity
    BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccounts++;
    }

    // Static method
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    // Display details
    public void displayDetails() {
        if (this instanceof BankAccount) {   // instanceof usage
            System.out.println("Bank: " + bankName + ", Holder: " + accountHolderName + ", Account No: " + accountNumber);
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Utkarsh", 101);
        BankAccount a2 = new BankAccount("Kavya", 102);

        a1.displayDetails();
        a2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
