package account;

public class account {
    private String name;
    private int accountnumber;
    private double balance;
    
    public account(String name, int accountnumber) {
        this.name = name;
        this.accountnumber = accountnumber;
    }

    public account(String name, int accountnumber, double initialDeposit) {
        this.name = name;
        this.accountnumber = accountnumber;
        deposit(initialDeposit);
    }

    public String getName() {
        return name;
    }

    
    public int getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(int accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }
    
    public String toString() {
        return "Account "
                + accountnumber
                + ", Holder:"
                + name
                + ", Balance "
                + String.format("%.2f", balance);
    }
    
}


