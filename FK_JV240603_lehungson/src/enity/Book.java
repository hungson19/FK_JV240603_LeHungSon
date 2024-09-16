package enity;


import java.util.Scanner;

public class Book implements IBookManagement {
    private int bookId;
    private String bookName;
    private String title;
    private String author;
    private int totalPages;
    private String content;
    private String publisher;
    private double price;
    private int typeId;
    private boolean isDeleted;

    public Book() {}

    public Book(int bookId, String bookName, String title, String author, int totalPages, String content, String publisher, double price, int typeId, boolean isDeleted) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.content = content;
        this.publisher = publisher;
        this.price = price;
        this.typeId = typeId;
        this.isDeleted = isDeleted;
    }

    // Getters and setters

    @Override

    public void inputData(Scanner scanner) {
        System.out.print("Enter book name: ");
        this.bookName = scanner.nextLine();
        System.out.print("Enter title: ");
        this.title = scanner.nextLine();
        System.out.print("Enter author: ");
        this.author = scanner.nextLine();
        System.out.print("Enter total pages: ");
        this.totalPages = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter content: ");
        this.content = scanner.nextLine();
        System.out.print("Enter publisher: ");
        this.publisher = scanner.nextLine();
        System.out.print("Enter price: ");
        this.price = Double.parseDouble(scanner.nextLine());
        System.out.print("Enter type ID: ");
        this.typeId = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void displayData() {
        System.out.println("Book ID: " + this.bookId);
        System.out.println("Book Name: " + this.bookName);
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Total Pages: " + this.totalPages);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Price: " + this.price);
    }
}

