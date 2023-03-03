package lab4.Task6;
public class BankAccount {

    private Long accountNumber;
    private Double balance;
    private String owner;

    public BankAccount() {
    }

    public BankAccount(Long accountNumber, Double balance, String owner) {
        this.accountNumber = checkAccountNumberLength(accountNumber);
        this.balance = checkBalance(balance);
        this.owner = owner;
    }

    public void deposit(Double fund) {
        if (fund > 0)
            balance += fund;
        else {
            System.out.println("Invalid fund!");
            System.exit(1);
        }
    }

    public void withdraw(Double fund) {
        if (fund > 0 && balance - fund >= 0)
            balance -= fund;
        else {
            System.out.println("Invalid fund!");
            System.exit(1);
        }
    }
    public void printInfo() {
        System.out.println("Account number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Owner: " + owner);
    }
    private Long checkAccountNumberLength(Long accountNumber) {
        if (String.valueOf(accountNumber).length() == 16)
            return accountNumber;

        System.out.println("Invalid account number!");
        System.exit(1);
        return null;
    }

    private Double checkBalance(Double balance) {
        if (balance >= 0)
            return balance;

        System.out.println("Invalid balance!");
        System.exit(1);
        return null;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = checkAccountNumberLength(accountNumber);
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = checkBalance(balance);
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
