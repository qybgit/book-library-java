package com.book.service.impl;

import com.book.dao.BookMapper;
import com.book.service.ReturnService;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ReturnServiceimpl implements ReturnService {
    @Override
    public boolean returnData(List<String> list) {
        SqlSession sqlsession= MybatisUtil.getSession();
        BookMapper mapper=sqlsession.getMapper(BookMapper.class);
        for(String s:list){
            mapper.updataReturnData(Integer.parseInt(s));
            mapper.updatehave( mapper.selectBookIdById(Integer.parseInt(s)));
        }
        return true;
    }

    @Override
    public boolean borrowDate(List<String> list) {
        SqlSession sqlsession= MybatisUtil.getSession();
        BookMapper mapper=sqlsession.getMapper(BookMapper.class);
        for(String s:list){
            mapper.updataBorrowData(Integer.parseInt(s));
        }return true;
    }
}
