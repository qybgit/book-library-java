package com.book.service;

import com.book.entity.Fine;

import java.util.List;

public interface FineService {
    boolean selectBorrow();
    boolean crateFine(List<Fine> fineList);
    List<Fine> fineNo();
    List<Fine> fineYes();
}
