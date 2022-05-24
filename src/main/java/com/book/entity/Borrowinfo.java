package com.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Borrowinfo {
    int reader;
    int bookId;
    String bookimg;
    String bookName;
    String  borrowDate;
    String  returnedDate;
    String  returnDate;

    public void setBorrow(int reader, int bookname, String borrowData, String returnedData, String returnData) {
        this.reader = reader;
        this.bookId = bookname;
        this.borrowDate = borrowData;
        this.returnedDate = returnedData;
        this.returnDate = returnData;
    }
    public Borrowinfo(){

    }

}
