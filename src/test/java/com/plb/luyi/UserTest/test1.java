package com.plb.luyi.UserTest;

import com.plb.luyi.entity.User;
import com.plb.luyi.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.util.Date;

/* 注册功能测试类 */

@SpringBootTest//注明当前是一个测试类
@RunWith(SpringRunner.class)//表示启动单元测试类（不写不能运行），需传递参数必须是SpringRunner类
public class test1 {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void reg(){
        Integer num = userMapper.insertUser("plb","15843573170","123456","武汉","00",new Date());
        System.out.println(num);
    }

    @Test
    public void delete(){
        Integer num = userMapper.deleteUser("15843573170");
        System.out.println(num);
    }

}
