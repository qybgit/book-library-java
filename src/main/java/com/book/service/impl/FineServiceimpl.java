package com.book.service.impl;

import com.book.dao.FineMapper;
import com.book.entity.Borrow;
import com.book.entity.Borrowinfo;
import com.book.entity.Fine;
import com.book.entity.ShopingBorrow;
import com.book.service.FineService;
import com.book.utils.MybatisUtil;
import lombok.Data;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
@Data
public class FineServiceimpl implements FineService {
    SqlSession session= MybatisUtil.getSession();
    FineMapper mapper=session.getMapper(FineMapper.class);
    ShopingBorrow shopingBorrow=new ShopingBorrow();
    List<Fine> fineList=new ArrayList<>();

    public void setFineList(List<Fine> fineList) {
        this.fineList = fineList;
    }

    public List<Fine> getFineList() {
        return fineList;
    }

    @Override
    public boolean selectBorrow() {
        List<Borrow> borrowList=mapper.selectFine();//超期的借阅记录查询

        shopingBorrow.toBorrowinfo(borrowList);
//        shopingBorrow.getBorrowList().forEach(System.out::println);
        return true ;
    }

    @Override
    public boolean crateFine(List<Fine> fineList1) {
        this.fineList=fineList1;
        List<Borrowinfo> borrowinfoList=shopingBorrow.getBorrowList();
        for (int i = 0; i < borrowinfoList.size(); i++) {
            double price=0.00;
            Borrowinfo borrowinfo=borrowinfoList.get(i);
            if(Integer.parseInt(mapper.selectFineDate(borrowinfoList.get(i).getBorrowDate(),borrowinfoList.get(i).getReturnedDate()))<15){
                price= Double.parseDouble(mapper.selectFineDate(borrowinfoList.get(i).getBorrowDate(),borrowinfoList.get(i).getReturnedDate()));
            }else {
                price=30.00;
            }


            Fine fine=new Fine(borrowinfo.getBookName(),borrowinfo.getBorrowDate(),borrowinfo.getReturnDate(),price,borrowinfo.getId());
fineList.add(fine);
mapper.insertFine(fine.getName(),fine.getPrice(),fine.getBorrowDate(),fine.getReturnedDate(),fine.getBorrowId());

        }

        return true;
    }

    @Override
    public List<Fine> fineNo() {
        List<Fine> fineList1=mapper.selectFineNo();
        return fineList1;
    }

    @Override
    public List<Fine> fineYes() {
        List<Fine> fineList2=mapper.selectFineYes();
        return fineList2;
    }


}
