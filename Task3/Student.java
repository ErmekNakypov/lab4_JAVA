package lab4.Task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student {
    private String name;
    private String major;
    private Double GPA;

    public Student() {
    }

    public Student(String name, String major, Double GPA) throws FileNotFoundException {
        this.name = name;
        this.major = checkMajor(major);
        this.GPA = checkGPA(GPA);
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Major: " + major);
        System.out.println("GPA: " + GPA);
    }

    private String checkMajor(String major) throws FileNotFoundException {
        File file = new File("C:\\Users\\space\\OneDrive\\Рабочий стол\\java_uni\\java_labs\\src\\lab4\\Task3\\kstu-majors");
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String nextLine = sc.nextLine();
            if (major.equalsIgnoreCase(nextLine))
                return nextLine;
        }
        System.out.println("Invalid major");
        System.exit(1);
        return null;
    }

    private Double checkGPA(Double GPA) {
        if (GPA < 0.0 || GPA > 4.0) {
            System.out.println("Invalid GPA");
            System.exit(1);
        }
        return GPA;
    }

    public void getLetterGrade(Double GPA) {
        if (GPA == 4.0)
            System.out.println("A+");
        else if (GPA >= 3.75)
            System.out.println("A");
        else if (GPA >= 3.5)
            System.out.println("A-");
        else if (GPA >= 3.25)
            System.out.println("B+");
        else if (GPA >= 3.0)
            System.out.println("B");
        else if (GPA >= 2.75)
            System.out.println("B-");
        else if (GPA >= 2.0)
            System.out.println("C");
        else if (GPA >= 0.0)
            System.out.println("F");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) throws FileNotFoundException {
        this.major = checkMajor(major);
    }

    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = checkGPA(GPA);
    }
}
