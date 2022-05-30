package com.book.service;

import javax.servlet.http.HttpSession;

public interface StudentService {
    boolean pangduan(String username, String password, HttpSession session);
    boolean register(String name,String email,String grade ,String pwd);
    boolean changePassword(String id,String pwd);

}
