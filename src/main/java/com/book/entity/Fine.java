package com.book.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Fine {

    String name;
    String BorrowDate;
    String ReturnedDate;
    double price;
    int borrowId;
    public Fine(){

    }
}
