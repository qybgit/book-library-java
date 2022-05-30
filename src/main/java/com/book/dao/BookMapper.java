package com.book.dao;

import com.book.entity.Book;
import com.book.entity.BookClass;
import com.book.entity.Borrow;
import org.apache.ibatis.annotations.*;

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
    @Update("update book set status='不在库' where Id=#{id}")
    void selectnot(int id);
    @Update("update book set status='在库' where Id=#{id}")
    void updatehave(int id);
    @Insert("insert into borrow(readerId,bookId,borrowDate,returnedDate,returnDate,reBorrow) values(#{readId},#{bookId},now(),DATE_ADD(now(),INTERVAL 1 MONTH),null,'n')")
    int insertBorrow(@Param("readId") int readId,@Param("bookId") int bookId);
    @Select("select * from borrow where bookId=#{booId}")
    Borrow selectBorrow(int bookId);
    @Select("select * from borrow where ReaderId=#{readId}")
    List<Borrow> selectBorrowList(int readId);
    @Select("select ImageUrl from book where Id=#{bookId}")
    String selectimg(int bookId);
    @Select("select name from book where Id=#{bookId}")
    String selectbookname(int bookId);
    @Update("update borrow set returnDate=now() where id=#{id}")
    int updataReturnData(int id);
    @Select("select bookId from borrow where id=#{id}")
    int selectBookIdById(int id);
    @Update("update borrow set borrowDate=now() where id=#{id}")
    int updataBorrowData(int id);
    @Delete("DELETE from borrow where id=#{id}")
    int deleteborrow(int id);
}
