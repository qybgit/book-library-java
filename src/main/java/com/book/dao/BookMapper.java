package com.book.dao;

import com.book.entity.Book;
import com.book.entity.BookClass;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookMapper {
    @Select("select * from category ")
    List<BookClass> selectBook();
    @Select("select * from book where CategoryId=#{id}")
    List<Book> selectBookByid(String id);
    @Select("select * from book where  Name like '%${name}%'")
    List<Book> selectsearch(String name);
@Select("select * from book")
    List<Book> book();
    @Select("select * from book where Id=#{id}")
    Book selectoneBookByid(String id);
    @Update("update book set status='无货' where Id=#{id}")
    void selectnot(int id);
    @Update("update book set status='有货' where Id=#{id}")
    void selecthave(int id);
}
