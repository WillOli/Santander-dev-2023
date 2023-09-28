package com.willdev.service;

import com.willdev.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
