package com.xcoder.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import com.xcoder.model.User;
import org.junit.jupiter.api.Test;

class UserServiceTest {
    private final UserService userService = new UserService();

    @Test
    void getAll() {
        List<User> actual = userService.getAll();

        assertEquals(3, actual.size());
    }
}