package com.book.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Book {
    String Id;
    String Code;
    String Name;
    String Authors;
    String Press;
    String Description;
    String Price;
    String Status;
}
