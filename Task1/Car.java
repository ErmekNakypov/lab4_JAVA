package lab4.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Year;
import java.util.Scanner;

public class Car {

    private String make;
    private String model;
    private Integer year;
    public Car() {
    }
    public Car(String make, String model, Integer year) throws FileNotFoundException {
        this.make = checkMake(make);
        this.model = checkModel(model, this.make);
        this.year = checkYear(year);
    }

    private Integer checkYear(Integer year) {
        if (Year.now().getValue() >= year && year > 0)
            return year;

        System.out.println("Invalid year");
        System.exit(1);
        return null;
    }

    private String checkMake(String make) throws FileNotFoundException {
        File file = new File("C:\\Users\\space\\OneDrive\\Рабочий стол\\java_uni\\java_labs\\src\\lab4\\Task1\\car-brands.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            if (nextLine.equalsIgnoreCase(make)) {
                return nextLine;
            }
        }
        System.out.println("Invalid car-brand!");
        System.exit(1);
        return null;
    }

    private String checkModel(String model, String make) throws FileNotFoundException {
        File file = new File("C:\\Users\\space\\OneDrive\\Рабочий стол\\java_uni\\java_labs\\src\\lab4\\Task1\\car-models.txt");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            if (nextLine.equalsIgnoreCase(make)) {
                while (!nextLine.equals("END")) {
                    nextLine = sc.nextLine();
                    if (nextLine.equalsIgnoreCase(model)) {
                        return nextLine;
                    }
                }
            }
        }
        System.out.println("Invalid car-model!");
        System.exit(1);
        return null;
    }

    public void printCarInfo() {
        System.out.println("The make: " + make);
        System.out.println("The model: " + model);
        System.out.println("The year: " + year);
    }
    public String getMake() {
        return make;
    }

    public void setMake(String make) throws FileNotFoundException {
        this.make = checkMake(make);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) throws FileNotFoundException {
        this.model = checkModel(model, this.make);
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = checkYear(year);
    }
}
