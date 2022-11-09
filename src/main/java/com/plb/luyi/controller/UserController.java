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

        //手机号唯一检测

        //用户名唯一检测
        JsonResult<Void> result = new JsonResult<>();

        userService.reg(userNow);
        result.setState(666);
        result.setMessage("注册成功");

        return result;
    }

    /* 注销控制器 */
    @RequestMapping("logout")
    public JsonResult<Void> logout(String phoneNumber){

        JsonResult<Void> result = new JsonResult<>();
        //手机号存在检验

        userService.deleteUser(phoneNumber);
        result.setState(666);
        result.setMessage("注销成功");

        return result;
    }

    /* 修改信息控制器 */
    /* 修改个人信息 */
    @RequestMapping("updateUserInfo")
    public JsonResult<Void> updateUserInfo(User user){

        JsonResult<Void> result = new JsonResult<>();

        userService.updateUserInfo(user);
        result.setState(666);
        result.setMessage("修改个人信息成功");


        return result;
    }
    /* 修改密码 */
    @RequestMapping("updatePassword")
    public JsonResult<Void> updateUserPassword(User user){
        //用户名存在检验

        //用户前后密码不能相等

        //设置pastPW
        JsonResult<Void> result = new JsonResult<>();

        userService.updatePassword(user);
        result.setState(666);
        result.setMessage("修改密码成功");

        return result;

    }

    /* 查询信息控制器 */


    /* 根据用户名登录*/
    @RequestMapping("logByName")
    public JsonResult<User> getUserByUsername(String username,String password ){
        User user = userService.getUserInfoByUsername(username,password);
        JsonResult<User> result = new JsonResult<>();

        result.setData(user);
        result.setState(OK);
        result.setMessage("success");


        return result;
    }

    /* 根据电话号查询用户 */
    @RequestMapping("logByNumber")
    public JsonResult<User> getUserByPhoneNumber(String phoneNumber,String password){
        User user = userService.getUserInfoByPhoneNumber(phoneNumber,password);
        JsonResult<User> result = new JsonResult<>();

        result.setData(user);
        result.setState(OK);
        result.setMessage("success");

        return result;
    }

    /* 根据电话号查找密码 */
    @RequestMapping("findPwByNumber")
    public JsonResult<String> getPasswordByPhoneNumber(String PhoneNumber){

        String pw = userService.getPassword(PhoneNumber);

        JsonResult<String> result = new JsonResult<>();

        result.setData(pw);
        result.setState(OK);
        result.setMessage("查询成功");


        return result;

    }

    /* 功能函数 */
    /* 修改ip,在每次登录时自动访问*/
    public Boolean updateIp(String username ,String ip){

        try {
            userService.updateIp(username,ip);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

}
