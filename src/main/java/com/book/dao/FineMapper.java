package com.book.dao;

import com.book.entity.Borrow;
import com.book.entity.Fine;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FineMapper {
    @Select("select *  FROM  borrow  where TIMESTAMPDIFF(SECOND,returnedDate,returnDate)")
    List<Borrow> selectFine();
    @Select("SELECT  TIMESTAMPDIFF(day,#{borrowDate},#{returnedDate}) as time")
    String selectFineDate(@Param("borrowDate") String borrowDate,@Param("returnedDate")String returnedDate);
    @Select("SELECT * FROM borrow WHERE  TIMESTAMPDIFF(SECOND,returnedDate,returnDate)")
    List<Borrow> selectFineTable();
    @Insert("insert into fine(name,price,borrowDate,returnedDate,borrowId) values(#{name},#{price},#{borrowDate},#{returnedDate},#{borrowId})")
    int insertFine(@Param("name")String name,@Param("price")double price,@Param("borrowDate")String borrowDate,@Param("returnedDate")String returnDate,@Param("borrowId")String borrowId);
    @Select("select * from fine where status='未缴'")
    List<Fine> selectFineNo();
    @Select("select * from fine where status='已缴'")
    List<Fine> selectFineYes();


}