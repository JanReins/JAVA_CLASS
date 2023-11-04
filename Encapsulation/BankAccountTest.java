class BankAccount {
    private String accountNumber;
    private double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
        
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
        
    public double getBalance() {
        return balance;
    }
        
    public void setBalance(double balance) {
        this.balance = balance;
    }
        
    public void deposit(double amount) {
        balance = balance + amount;
    }
        
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        }
        else {
            System.out.println("Insufficient Funds");
        }
    }      
}  
    
    
public class BankAccountTest {
    public static void main(String[] args) {
    BankAccount account1 = new BankAccount("1650", 10000);
        
    account1.deposit(20000);
    account1.withdraw(5000);
    account1.withdraw(100000);
        
    System.out.println("Account Number: " + account1.getAccountNumber());
    System.out.println("Balance: " + account1.getBalance());

}

}