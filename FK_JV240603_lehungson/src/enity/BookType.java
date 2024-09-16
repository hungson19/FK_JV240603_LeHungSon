package enity;


import java.util.Scanner;

public class BookType implements IBookManagement {
    private int typeId;
    private String typeName;
    private String description;
    private boolean isDeleted;

    public BookType() {}

    public BookType(int typeId, String typeName, String description, boolean isDeleted) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.description = description;
        this.isDeleted = isDeleted;
    }

    // Getters and setters

    @Override
    public void inputData(Scanner scanner) {
        System.out.print("Enter type name: ");
        this.typeName = scanner.nextLine();
        System.out.print("Enter description: ");
        this.description = scanner.nextLine();
    }

    @Override
    public void displayData() {
        System.out.println("Type ID: " + this.typeId);
        System.out.println("Type Name: " + this.typeName);
        System.out.println("Description: " + this.description);
    }

    public boolean isDeleted() {

        return false;
    }
}
