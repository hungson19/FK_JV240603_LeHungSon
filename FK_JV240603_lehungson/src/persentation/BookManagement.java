package persentation;


import business.BookBusiness;
import business.BookTypeBusiness;
import enity.BookType;

import java.util.Scanner;

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookTypeBusiness bookTypeBusiness = new BookTypeBusiness();
        BookBusiness bookBusiness = new BookBusiness();
        int choice;
        do {
            System.out.println("******************BOOK-MANAGEMENT******************");
            System.out.println("1. Quản lý loại sách");
            System.out.println("2. Quản lý sách");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    manageBookType(scanner, bookTypeBusiness);
                    break;
                case 2:
                    manageBook(scanner, bookBusiness);
                    break;
                case 3:
                    System.out.println("Thoát chương trình.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 3);
    }

    private static void manageBook(Scanner scanner, BookBusiness bookBusiness) {
        int choice;
        do {
            System.out.println("**********************BOOKTYPE-MENU********************");
            System.out.println("1. Danh sách sách");
            System.out.println("2. Tạo mới sách");
            System.out.println("3. Cập nhật thông tin sách");
            System.out.println("4. Xóa loại sách");
            System.out.println("5. Hiển thị danh sách các cuốn sách theo giá giảm dần");
            System.out.println("8. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    bookBusiness.displayAllBook();
                    break;
                case 2:
                    BookType bookType = new BookType();
                    bookType.inputData(scanner);
                    bookType.addBook(book);
                    break;
                case 8:
                    System.out.println("Thoát quản lý sách.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);
    }

    public static void manageBookType(Scanner scanner, BookTypeBusiness bookTypeBusiness) {
        int choice;
        do {
            System.out.println("**********************BOOKTYPE-MENU********************");
            System.out.println("1. Danh sách loại sách");
            System.out.println("2. Tạo mới loại sách");
            System.out.println("3. Cập nhật thông tin loại sách");
            System.out.println("4. Xóa loại sách");
            System.out.println("5. Thống kê số lượng sách theo mã loại sách");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    bookTypeBusiness.displayAllBookTypes();
                    break;
                case 2:
                    BookType bookType = new BookType();
                    bookType.inputData(scanner);
                    bookTypeBusiness.addBookType(bookType);
                    break;
                case 6:
                    System.out.println("Thoát quản lý loại sách.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 6);
    }
}

