package lab4.Task1;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        Car car1 = new Car();

        System.out.print("Enter the car's make: ");
        String make = scan.nextLine();
        car1.setMake(make);

        System.out.print("Enter the car's model: ");
        String model = scan.nextLine();
        car1.setModel(model);

        System.out.print("Enter the car's year: ");
        Integer year = scan.nextInt();
        car1.setYear(year);

        car1.printCarInfo();
        System.out.println();

        Car car2 = new Car("Mazda", "MX3", 2004);
        car2.printCarInfo();
    }
}
