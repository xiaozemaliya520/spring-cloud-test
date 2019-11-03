package com.itcast.dao;

import com.itcast.springIOC.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userda = applicationContext.getBean(UserService.class);
        userda.show();
    }
}
