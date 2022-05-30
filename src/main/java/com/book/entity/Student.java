package com.book.entity;

import lombok.Data;
import lombok.ToString;
import org.apache.ibatis.annotations.Param;

@Data
@ToString
public class Student {
    String id;
   public String Name;
     String bj;
     String Email;
     String deposit;
}
