class BankAccount_toString {
    private String accountNumber;
    private double balance;
    
    public BankAccount_toString(String accountNumber, double balance) {
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
    
    
    //override toString()
    public String toString(){
        return "Account Number: " + accountNumber + "\nBalance: " + balance;

    }
    //override
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    } else if (obj == null || getClass() != obj.getClass()) {
        return false;
    }

    BankAccount that = (BankAccount) obj;
    return getAccountNumber().equals(that.getAccountNumber()) && getBalance() == that.getBalance();
}

}  
    
    
public class BankAccountTest_toString {
    public static void main(String[] args) {
    BankAccount account1 = new BankAccount("1650", 10000);
    BankAccount account2 = new BankAccount("1651", 35000);
        
    account1.deposit(20000);
    account1.withdraw(5000);
    account1.withdraw(100000);

    System.out.println("Account Number: " + account1.getAccountNumber());
    System.out.println("Balance: " + account1.getBalance());
    System.out.println(account1.toString());


    account2.deposit(15000);
    account2.withdraw(10000);
    account2.withdraw(300000);

    System.out.println("Account Number: " + account2.getAccountNumber());
    System.out.println("Balance: " + account2.getBalance());
    System.out.println(account2.toString());

    boolean isequa1and2 = account1.equals(account2);
    System.out.println("Account 1 and Account 2 are equal: " + isequa1and2);
        

    }
}