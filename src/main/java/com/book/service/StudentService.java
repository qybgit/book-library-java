package com.book.service;

import javax.servlet.http.HttpSession;

public interface StudentService {
    boolean pangduan(String username, String password, HttpSession session);

}
