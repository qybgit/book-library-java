package com.book.dao;

import com.book.entity.Borrow;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface FineMapper {
    @Select("select *  FROM  borrow  where date(borrow.ReturnedDate) < date (borrow.ReturnDate)")
    List<Borrow> selectFine();
    @Select("SELECT  TIMESTAMPDIFF(day,#{borrowDate},#{returnedDate}) as time")
    String selectFineDate(@Param("borrowDate") String borrowDate,@Param("returnedDate")String returnedDate);
}
