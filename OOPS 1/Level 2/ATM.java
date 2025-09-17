public class ATM {
    public static class BankAccount{
        String accountHolder;
        int accountNumber;
        int balance;
        public void deposit(int amount){
            if(amount>0){
                balance+=amount;
                System.out.println("Deposited: "+amount);
            }
            else{
                System.out.println("Deposit amount must be positive");
            }
        }
        public void withdraw(int amount){
            if(amount>0){
            if(balance>=amount){
                balance=balance-amount;
                System.out.println("Withdrawn: "+amount);
            }
            else{
                System.out.println("Insufficient balance");
            }
            }
            else{
                System.out.println("Withdrawal amount must be positive");
            }
        }
        public void display(){
            System.out.println(balance);
        }
    }
    public static void main(String[] args) {
        
    }
}
