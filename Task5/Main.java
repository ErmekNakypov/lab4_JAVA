package lab4.Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shape shape = new Shape();

        System.out.print("Enter the length: ");
        Integer length = sc.nextInt();
        shape.setLength(length);

        System.out.print("Enter the width: ");
        Integer width = sc.nextInt();
        shape.setWidth(width);

        shape.getPer();
        shape.getArea();
    }
}
