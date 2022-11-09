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
    void updatePassword(User user);
    /* 修改个人信息业务 */
    void updateUserInfo(User user);
    /* 修改ip地址业务 */
    void updateIp(String username ,String ip);
    /* 根据用户名查找用户业务 */
    User getUserInfoByUsername(String username,String password);
    /* 根据手机号查找用户业务 */
    User getUserInfoByPhoneNumber(String phoneNumber,String password);
    /* 根据手机号查找密码业务 */
    String getPasswordByNumber(String phoneNumber);
    /**/
    String getPasswordByName(String username);
}
