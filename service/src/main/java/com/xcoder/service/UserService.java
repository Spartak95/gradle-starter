package com.xcoder.service;

import java.util.List;

import com.xcoder.dao.UserDao;
import com.xcoder.model.User;

public class UserService {

    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}
