package lab4.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book1 = new Book();

        System.out.print("Enter the name: ");
        String name = scan.nextLine();
        book1.setName(name);

        System.out.print("Enter the author: ");
        String author = scan.nextLine();
        book1.setAuthor(author);

        System.out.print("Enter the year: ");
        Integer year = scan.nextInt();
        book1.setYear(year);

        book1.printInfo();
    }
}
