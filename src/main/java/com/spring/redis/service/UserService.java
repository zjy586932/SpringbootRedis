package com.spring.redis.service;

import com.spring.redis.dao.UserRepository;
import com.spring.redis.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Cacheable(value = "USERSERVICE")
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
