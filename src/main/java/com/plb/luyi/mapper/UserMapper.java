package com.plb.luyi.mapper;

import com.plb.luyi.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public interface UserMapper {
    /**
     * User映射逻辑
     */

    /* 插入,注册映射 */
    Integer insertUser(String username,String phonenumber,String password,String ip,String avatar,Date birthday);
    /* 删除,用户注销映射*/
    Integer deleteUser(String phoneNumber);
    /* 更新,修改用户信息映射 */
    Integer updateUserInfo(String username, String avatar, Date birthday);
    /* 更新,更改密码映射 */
    Integer updateUserPassword(String username ,String password);
    /* 更新,更改用户IP */
    Integer updateIP(String username,String ip);
    /* 查询,根据用户名和密码查找用户映射 */
    User findUserByUsername(String username,String password);
    /* 查询,根据手机号和密码查找用户映射 */
    User findUserByPhoneNumber(String phoneNumber,String password);
    /* 查询,根据手机号查找密码 */
    User findIPasswordByPhoneNumber(String phoneNumber);
}
