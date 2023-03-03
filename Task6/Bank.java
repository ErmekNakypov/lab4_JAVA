package lab4.Task6;

import java.util.ArrayList;

public class Bank {
    private String name;
    private String location;

    private ArrayList<BankAccount> bankAccounts = new ArrayList<>();

    public Bank() {
    }

    public Bank(String name, String location, ArrayList<BankAccount> bankAccounts) {
        this.name = name;
        this.location = location;
        this.bankAccounts = bankAccounts;
    }

    public void addAccount(BankAccount bankAccount) {
        bankAccounts.add(bankAccount);
    }
    public void deleteAccount(int index) {
        bankAccounts.remove(index);
    }
    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Accounts:");
        for (BankAccount bankAccount : bankAccounts) {
            bankAccount.printInfo();
        }
        System.out.println();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
