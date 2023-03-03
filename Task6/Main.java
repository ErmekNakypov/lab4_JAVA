package lab4.Task6;


public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.setName("Demir Bank");
        bank.setLocation("Chuy 12");

        BankAccount bankAccount1 = new BankAccount(1111_1111_1111_1111L, 60000., "Ermek Nakypov");
        BankAccount bankAccount2 = new BankAccount(1111_1111_1111_1112L, 3100.12, "Arsen Sagynbekov");
        BankAccount bankAccount3 = new BankAccount(1121_1111_1111_1112L, 0., "Asanbek u Rysbek");
        bank.addAccount(bankAccount1);
        bank.addAccount(bankAccount2);
        bank.addAccount(bankAccount3);

        bank.printInfo();

        bank.deleteAccount(1);
        bank.printInfo();

        BankAccount bankAccount4 = new BankAccount(1321_1111_1111_1112L, 1000., "Jon Jones");
        bank.addAccount(bankAccount4);
        bank.printInfo();
    }
}
