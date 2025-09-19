class BankAccount {
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;
    private String accountHolderName;
    private final int accountNumber;
    private double balance;
    public BankAccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }
    public static void getTotalAccounts() {
        System.out.println("Total accounts created: " + totalAccounts);
    }
    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: ₹" + balance);
            System.out.println("-------------------------");
        } else {
            System.out.println("Not a valid BankAccount object!");
        }
    }
}
class Main {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Ravi Kumar", 1001, 5000.0);
        BankAccount acc2 = new BankAccount("Sneha Sharma", 1002, 10000.0);
        acc1.displayDetails();
        acc2.displayDetails();
        BankAccount.getTotalAccounts();
    }
}
