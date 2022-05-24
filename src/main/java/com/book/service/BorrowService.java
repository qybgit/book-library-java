package com.book.service;

import com.book.entity.ShopingBorrow;
import com.book.entity.Shopingbook;

import java.util.List;

public interface BorrowService{
        boolean insert(int readId, List<String> bookId, ShopingBorrow borrow,Shopingbook booklist);
}
