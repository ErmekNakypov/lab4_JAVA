package lab4.Task3;

import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        Student student1 = new Student();

        System.out.print("Enter the student name: ");
        String name = sc.nextLine();
        student1.setName(name);

        System.out.print("Enter the student major: ");
        String major = sc.nextLine();
        student1.setMajor(major);

        System.out.print("Enter the student GPA: ");
        Double GPA = sc.nextDouble();
        student1.setGPA(GPA);

        student1.printInfo();
        student1.getLetterGrade(GPA);

        Student student2 = new Student("Arsen", "Software Engineering(English)", 0.0);
        student2.printInfo();
        student2.getLetterGrade(student2.getGPA());
    }
}
