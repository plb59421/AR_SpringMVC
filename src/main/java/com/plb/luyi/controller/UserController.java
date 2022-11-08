package com.plb.luyi.controller;

import com.plb.luyi.entity.User;
import com.plb.luyi.service.IUserService;
import com.plb.luyi.service.ex.InsertException;
import com.plb.luyi.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.*;
import java.util.Date;

@RestController
@RequestMapping("user")
public class UserController extends BaseController{

    @Autowired
    private IUserService userService;

    private User userNow;

    /* 注册控制器 */
    @RequestMapping("reg")
    public JsonResult<Void> reg(User user) {
        this.userNow=user;
        String password = userNow.getPassword();

        //密码加密功能


        JsonResult<Void> result = new JsonResult<>();
        try {
            userService.reg(userNow);
            result.setState(666);
            result.setMessage("注册成功");
        } catch (InsertException e) {
            result.setState(502);
            result.setMessage("注册失败,信息在");
        }
        return result;
    }

    /* 注销控制器 */
    @RequestMapping("logout")
    public JsonResult<Void> logout(String phoneNumber){
        return null;
    }

    /* 修改信息控制器 */
    /* 修改个人信息 */
    @RequestMapping("updateUserInfo")
    public JsonResult<Void> updateUserInfo(String username, Image avatar, Date birthday){
        return null;
    }
    /* 修改密码 */
    @RequestMapping("updatePassword")
    public JsonResult<Void> updateUserPassword(String username,String password){
        return null;
    }
    /* 修改ip */
    @RequestMapping("updateIp")
    public JsonResult<Void> updateIp(String username ,String ip){
        return null;
    }

    /* 查询信息控制器 */
    /* 根据用户名查询用户 */
    @RequestMapping("findUserByName")
    public JsonResult<User> getUserByUsername(String username,String password ){
        return null;
    }

    /* 根据电话号查询用户 */
    @RequestMapping("findUserByNumber")
    public JsonResult<User> getUserByPhoneNumber(String phoneNumber,String password){
        return null;
    }

    /* 根据电话号查找密码 */
    @RequestMapping("findPasswordByNumber")
    public JsonResult<String> getPasswordByPhoneNumber(String PhoneNumber){
        return null;
    }

}
