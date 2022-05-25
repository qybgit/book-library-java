package com.book.service.impl;

import com.book.dao.BookMapper;
import com.book.entity.ShopingBorrow;
import com.book.entity.Shopingbook;
import com.book.service.BorrowService;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class BorrowServiceimpl implements BorrowService {
    @Override
    public boolean insert(int readId, List<String> bookId, ShopingBorrow borrow,Shopingbook booList) {

        SqlSession sqlsession= MybatisUtil.getSession();
        BookMapper mapper=sqlsession.getMapper(BookMapper.class);
        for (int i = 0; i < bookId.size(); i++) {
            mapper.insertBorrow(readId, Integer.parseInt(bookId.get(i)));//根据bookId插入borrow表图书数据
            mapper.selectnot(Integer.parseInt(bookId.get(i)));//把图书状态变更
//            borrow.tran(Integer.parseInt(bookId.get(i)));
            booList.remover(bookId.get(i));//删除书架以借阅的书籍
        }return true;
    }
}
