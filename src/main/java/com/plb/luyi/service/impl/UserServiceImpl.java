package com.plb.luyi.service.impl;

import com.plb.luyi.entity.User;
import com.plb.luyi.mapper.UserMapper;
import com.plb.luyi.service.IUserService;
import com.plb.luyi.service.ex.*;
import org.apache.ibatis.annotations.Delete;
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
        Integer rows = userMapper.deleteUser(phoneNumber);
        if (rows!=1){
            throw new DeleteException("在删除记录过程中产生了未知的异常");
        }
    }

    @Override
    public void updatePassword(User user) {
        Integer rows = userMapper.updateUserPassword(user.getPhoneNumber(),user.getPassword(),user.getPassword_past(),user.getUsername());
        if (rows!=1){
            throw new UpdateException("在更新密码过程中产生了未知异常");
        }
    }

    @Override
    public void updateUserInfo(User user) {
        Integer rows = userMapper.updateUserInfo(user.getUsername(),user.getAvatar(),user.getBirthday(),user.getPhoneNumber());
        if(rows!=1){
            throw new UpdateException("在更新用户信息过程中产生了未知异常");
        }
    }

    @Override
    public void updateIp(String username,String ip) {
        Integer rows = userMapper.updateIP(username,ip);
        if(rows!=1){
            throw new UpdateException("在更新ip过程中产生未知异常");
        }
    }

    @Override
    public User getUserInfoByUsername(String username,String password) {
       User user = userMapper.findUserByUsername(username);
       if (user==null){
           throw new SelectException("根据用户名查找用户时产生未知异常");
       }
        if(user.getPassword().equals(password)){
            throw new PasswordException("密码错误");
        }
       return user;
    }

    @Override
    public User getUserInfoByPhoneNumber(String phoneNumber,String password) {
        User user = userMapper.findUserByPhoneNumber(phoneNumber);
        if (user==null){
            throw new SelectException("根据手机号查找用户时产生未知异常");
        }
        if(user.getPassword().equals(password)){
            throw new PasswordException("密码错误");
        }

        return user;
    }

    @Override
    public String getPassword(String phoneNumber) {
        String str = userMapper.findPasswordByPhoneNumber(phoneNumber);
        if(str==null){
            throw new SelectException("查找密码时发生未知错误");
        }
        return str;
    }
}
