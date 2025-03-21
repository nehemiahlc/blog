package com.codenemo.blog.services;

import com.codenemo.blog.domain.entities.User;

import java.util.UUID;

public interface UserService {
    User getUserById(UUID id);
}
