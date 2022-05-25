package com.book.service.impl;

import com.book.dao.BookMapper;
import com.book.service.DeleteService;
import com.book.utils.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

public class DeleteServiceimpl implements DeleteService {

    @Override
    public void deleteborrow(int id) {
        SqlSession sqlsession= MybatisUtil.getSession();
        BookMapper mapper=sqlsession.getMapper(BookMapper.class);
        mapper.deleteborrow(id);
    }
}
