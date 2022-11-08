package com.plb.luyi.service.impl;

import com.plb.luyi.entity.User;
import com.plb.luyi.mapper.UserMapper;
import com.plb.luyi.service.IUserService;
import com.plb.luyi.service.ex.InsertException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public void reg(User user) {
        Integer rows = userMapper.insertUser(user.getUsername(),user.getPhoneNumber(),user.getPassword(),user.getIp(),user.getAvatar(), user.getBirthday());
        if(rows!=1){
            throw new InsertException("在表单提交过程中产生了未知的异常");
        }
    }

    @Override
    public void deleteUser(String phoneNumber) {

    }

    @Override
    public void updatePassword(String phoneNumber, String password) {

    }

    @Override
    public void updateUserInfo(String username, String avatar, Date birthday) {

    }

    @Override
    public void updateIp() {

    }

    @Override
    public List<User> getUserInfoByUsername(String username, String password) {
        return null;
    }

    @Override
    public List<User> getUserInfoByPhoneNumber(String phoneNumber, String password) {
        return null;
    }

    @Override
    public String getPassword(String phoneNumber) {
        return null;
    }
}
