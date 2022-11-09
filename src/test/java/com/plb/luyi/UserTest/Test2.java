package com.plb.luyi.UserTest;

import com.plb.luyi.entity.User;
import com.plb.luyi.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@SpringBootTest//注明当前是一个测试类
@RunWith(SpringRunner.class)//表示启动单元测试类（不写不能运行），需传递参数必须是SpringRunner类
public class Test2 {
    @Autowired
    private IUserService userService;
    @Test
    public void reg(){
        User user =new User("plb","123456","15843573170","武汉","00",new Date());
        userService.reg(user);
    }
    @Test
    public void delete(){
        userService.deleteUser("15843573170");
    }

    @Test
    public void updateInfo(){
        User user =new User("plb00","123456","15843573170","武汉","0000",new Date());
        userService.updateUserInfo(user);
    }

    @Test
    public void updatePw(){
        User user = new User("plb00","12345678","15843573170","武汉","0000",new Date());
        user.setPassword_past(userService.getPassword(user.getPhoneNumber()));
        userService.updatePassword(user);
    }

    @Test
    public void getPw(){
        String Pw ="15843573170";
        System.out.println( userService.getPassword(Pw));

    }

    @Test
    public void updateIp(){
        userService.updateIp("plb00","吉林");
    }

    @Test
    public void getUser(){
//       User user = userService.getUserInfoByUsername("plb00");
//       System.out.println( user);
//       user = userService.getUserInfoByPhoneNumber("15843573170");
//       System.out.println(user);
    }

}
