package com.book.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Borrow {
    int id;
    int readerId;
    int bookId;
    String  borrowDate;
    String  returnedDate;
    String  returnDate;
    String reBorrow;

}
