package com.book.service.impl;

import com.book.dao.FineMapper;
import com.book.dao.StudentMapper;
import com.book.service.Money;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class Moneyimpl implements Money {
    SqlSession session= MybatisUtil.getSession();
    FineMapper mapper=session.getMapper(FineMapper.class);
    StudentMapper mapper1=session.getMapper(StudentMapper.class);
    @Override
    public boolean returnMoney(int a,int deposit,int id) {
        double price=mapper.selectFineClass(a).getPrice();
        if(deposit<price)
            return false;
            mapper1.updateDeposit(price,id);
            mapper.updateStatus(a);

        return true;
    }
}
