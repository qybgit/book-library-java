package com.book.entity;

import com.book.dao.BookMapper;
import com.book.utils.MybatisUtil;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;
@Data
@AllArgsConstructor
public class ShopingBorrow {
    public List<Borrowinfo> borrowList;
    public Borrow borrow;
    public Borrowinfo borrowinfo;
    public ShopingBorrow() {
        borrowList=new ArrayList<>();
        borrow=new Borrow();
        borrowinfo=new Borrowinfo();
    }

    public List<Borrowinfo> getBorrowList() {
        return borrowList;
    }

    public void setBorrowList(List<Borrowinfo> borrowList) {
        this.borrowList = borrowList;
    }
//    public boolean tran(int bookId){
//        SqlSession sqlsession= MybatisUtil.getSession();
//        BookMapper mapper=sqlsession.getMapper(BookMapper.class);
//         borrow=mapper.selectBorrow(bookId);//查找借阅信息
//        borrowinfo.setBorrow(borrow.id, borrow.readerId,borrow.bookId,borrow.borrowDate,borrow.returnedDate,borrow.returnDate);
//        borrowList.add(borrowinfo);
//return true;
//    }
    public void toBorrowinfo(List<Borrow> borrows){
        SqlSession sqlsession= MybatisUtil.getSession();
        BookMapper mapper=sqlsession.getMapper(BookMapper.class);
        for (int i = 0; i < borrows.size(); i++) {
            Borrowinfo borrowinfo=new Borrowinfo();
            Borrow borrow=borrows.get(i);
            String bookimg=mapper.selectimg(borrows.get(i).getBookId());//获取图片
            String bookname=mapper.selectbookname(borrows.get(i).getBookId());//获取名称
            borrowinfo.setBorrow(borrow.getId(), borrow.getReaderId(), borrow.getBookId(), borrow.getBorrowDate(), borrow.getReturnedDate(), borrow.getReturnDate());//设置理想类
            borrowinfo.setBookimg(bookimg);//设置图片
            borrowinfo.setBookName(bookname);//设置名称
            borrowList.add(borrowinfo);
        }
    }




}
