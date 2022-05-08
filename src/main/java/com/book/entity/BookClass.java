package com.book.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BookClass {
    String  Id;
    String Code;
    String Name;


    public String getId() {
        return Id;
    }
}
