package com.skooch.service.impl;

import com.skooch.mapper.UserMapper;
import com.skooch.pojo.User;
import com.skooch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean createUser(User user) {
        return userMapper.insert(user) > 0;
    }

    @Override
    public boolean deleteUser(String id) {
        return userMapper.deleteById(id) > 0;
    }

    @Override
    public User getUserById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> getUserByName(String username) {
        return userMapper.getUserByName(username);
    }

    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.updateUser(user) > 0;
    }
}
