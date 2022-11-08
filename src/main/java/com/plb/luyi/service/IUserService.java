package com.plb.luyi.service;

import com.plb.luyi.entity.User;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public interface IUserService {
    /**
     * 用户业务接口
     */

    /* 注册业务 */
    void reg(User user);
    /* 删除用户业务 */
    void deleteUser(String phoneNumber);
    /* 修改密码业务 */
    void updatePassword(String phoneNumber,String password);
    /* 修改个人信息业务 */
    void updateUserInfo(String username, String avatar, Date birthday);
    /* 修改ip地址业务 */
    void updateIp();
    /* 用户名登录业务 */
    List<User> getUserInfoByUsername(String username,String password);
    /* 手机号登录业务 */
    List<User> getUserInfoByPhoneNumber(String phoneNumber,String password);
    /* 忘记密码，找回密码业务 */
    String getPassword(String phoneNumber);
}
