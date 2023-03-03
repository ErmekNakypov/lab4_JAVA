package lab4.Task4;

import java.time.Year;

public class Book {
    private String name;
    private String author;
    private Integer year;

    public Book() {
    }

    public Book(String name, String author, Integer year) {
        this.name = name;
        this.author = author;
        this.year = checkYear(year);
    }

    private Integer checkYear(Integer year) {
        if (Year.now().getValue() < year || year < 1) {
            System.out.println("Invalid year");
            System.exit(1);
        }
        return year;
    }

    public void printInfo() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = checkYear(year);
    }
}
