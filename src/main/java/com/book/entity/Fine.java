package com.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Fine {
    int id;
    String name;
    double price;
    String BorrowDate;
    String ReturnedDate;
    String borrowId;
    String status;


    public Fine(String name, String borrowDate, String returnDate, double price, int borrowId) {
        this.name = name;
        BorrowDate = borrowDate;
        ReturnedDate = returnDate;
        this.price = price;
        this.borrowId = String.valueOf(borrowId);
    }
}
