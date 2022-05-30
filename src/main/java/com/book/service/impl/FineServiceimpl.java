package com.book.service.impl;

import com.book.dao.FineMapper;
import com.book.entity.Borrow;
import com.book.entity.Borrowinfo;
import com.book.entity.Fine;
import com.book.entity.ShopingBorrow;
import com.book.service.FineService;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

public class FineServiceimpl implements FineService {
    SqlSession session= MybatisUtil.getSession();
    FineMapper mapper=session.getMapper(FineMapper.class);
    ShopingBorrow shopingBorrow=new ShopingBorrow();
    List<Fine> fineList=new ArrayList<>();
    @Override
    public boolean selectBorrow() {
        List<Borrow> borrowList=mapper.selectFine();

        shopingBorrow.toBorrowinfo(borrowList);
//        shopingBorrow.getBorrowList().forEach(System.out::println);
        return true ;
    }

    @Override
    public boolean crateFine() {
        List<Borrowinfo> borrowinfoList=shopingBorrow.getBorrowList();
        for (int i = 0; i < borrowinfoList.size(); i++) {
            double price=0.00;
            Borrowinfo borrowinfo=borrowinfoList.get(i);
            if(Integer.parseInt(mapper.selectFineDate(borrowinfoList.get(i).getBorrowDate(),borrowinfoList.get(i).getReturnedDate()))<15){
                price= Double.parseDouble(mapper.selectFineDate(borrowinfoList.get(i).getBorrowDate(),borrowinfoList.get(i).getReturnedDate()));
            }else {
                price=30.00;
            }


            Fine fine=new Fine(borrowinfo.getBookName(),borrowinfo.getBorrowDate(),borrowinfo.getReturnedDate(),price,borrowinfo.getId());


        }
        return true;
    }

}
