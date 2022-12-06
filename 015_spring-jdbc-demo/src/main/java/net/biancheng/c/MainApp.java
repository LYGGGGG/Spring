package net.biancheng.c;

/*
@author YG
@create 2022/12/6   23:05
*/

import net.biancheng.c.entity.User;
import net.biancheng.c.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = new User();
        user.setUserName("小张");
        user.setStatus("在线");

//        int i = userService.addUser(user); // 新增用户
//        int i = userService.updateUser(user, 6); // 更新用户
        int i = userService.deleteUser(user);
        if (i > 0) {
            System.out.println("删除用户成功");
        } else {
            System.out.println("失败");
        }
    }
}
