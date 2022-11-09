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
        //判断用户名是否唯一,否，则抛出异常

        //判断手机号是否唯一，否，则抛出异常

        Integer rows = userMapper.insertUser(user.getUsername(),user.getPhoneNumber(),user.getPassword(),user.getIp(),user.getAvatar(), user.getBirthday());
        if(rows!=1){
            throw new InsertException("在表单提交过程中产生了未知的异常");
        }
    }

    @Override
    public void deleteUser(String phoneNumber) {
        //检测电话号是否存在

        Integer rows = userMapper.deleteUser(phoneNumber);
        if (rows!=1){
            throw new DeleteException("在删除记录过程中产生了未知的异常");
        }
    }

    @Override
    public void updatePassword(User user) {
        //检测用户名是否存在
        User user0 = userMapper.findUserByUsername(user.getUsername());
        if(user0==null){
            throw new SelectException("用户不存在");
        }
        //判断密码是否一样
        if(user.getPassword().equals(userMapper.findPasswordByUsername(user.getUsername()))){
            throw new PasswordException("该密码与旧密码相同");
        }
        Integer rows = userMapper.updateUserPassword(user.getPhoneNumber(),user.getPassword(),user.getPassword_past(),user.getUsername());
        if (rows!=1){
            throw new UpdateException("在更新密码过程中产生了未知异常");
        }
    }

    @Override
    public void updateUserInfo(User user) {

        User user0 = userMapper.findUserByUsername(user.getUsername());
        //判断用户是否存在
        if(user0==null){
            throw new SelectException("用户不存在");
        }
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
        //检测用户名存在
        if (user==null){
           throw new SelectException("根据用户名查找用户时产生未知异常");
        }
        //检测密码是否正确
        if(user.getPassword().equals(password)){
            throw new PasswordException("密码错误");
        }
       return user;
    }

    @Override
    public User getUserInfoByPhoneNumber(String phoneNumber,String password) {
        User user = userMapper.findUserByPhoneNumber(phoneNumber);
        //检测电话号是否存在
        if (user==null){
            throw new SelectException("根据手机号查找用户时产生未知异常");
        }
        //检测密码是否正确
        if(user.getPassword().equals(password)){
            throw new PasswordException("密码错误");
        }

        return user;
    }

    @Override
    public String getPasswordByNumber(String phoneNumber) {
        String str = userMapper.findPasswordByPhoneNumber(phoneNumber);
        //检测电话号是否存在
        if(str==null){
            throw new SelectException("查找密码时发生未知错误");
        }
        return str;
    }
    @Override
    public String getPasswordByName(String username) {
        String str = userMapper.findPasswordByUsername(username);
        //检测电话号是否存在
        if(str==null){
            throw new SelectException("查找密码时发生未知错误");
        }
        return str;
    }
}
