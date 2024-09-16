package business;

import enity.BookType;


import java.util.ArrayList;
import java.util.List;

public class BookTypeBusiness {
    private List<BookType> bookTypeList = new ArrayList<>();

    public void addBookType(BookType bookType) {
        bookTypeList.add(bookType);
        System.out.println("Book type added successfully.");
    }

    public void displayAllBookTypes() {
        for (BookType bookType : bookTypeList) {
            if (!bookType.isDeleted()) {
                bookType.displayData();
            }
        }
    }
}

