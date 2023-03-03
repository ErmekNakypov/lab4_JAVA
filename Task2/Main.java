package lab4.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BankAccount bankAccount1 = new BankAccount();

        System.out.print("Enter the account number: ");
        Long accountNumber = scan.nextLong();
        bankAccount1.setAccountNumber(accountNumber);

        System.out.print("Enter the balance: ");
        Double balance = scan.nextDouble();
        bankAccount1.setBalance(balance);

        scan.nextLine();

        System.out.print("Enter the owner: ");
        String owner = scan.nextLine();
        bankAccount1.setOwner(owner);

        bankAccount1.printInfo();

        System.out.print("Enter the fund to withdraw: ");
        Double withdrawFund = scan.nextDouble();
        bankAccount1.withdraw(withdrawFund);

        bankAccount1.printInfo();

        System.out.print("Enter the fund to deposit: ");
        Double depositFund = scan.nextDouble();
        bankAccount1.deposit(depositFund);

        bankAccount1.printInfo();
    }
}
