package com.book.service;

import com.book.entity.Fine;

import java.util.List;

public interface FineService {
    boolean selectBorrow();
    boolean crateFine(List<Fine> fineList,int a);
    List<Fine> fineNo();
    List<Fine> fineYes();
    boolean returnMoney(int a);
}
