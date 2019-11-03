package com.itcast.springIOC.service.impl;


import com.itcast.springIOC.dao.UserDao;
import com.itcast.springIOC.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Value("府城伯")
    private String name;

//    private List list;

    @Override
    public void show() {
        userDao.show();
        System.out.println(name);
//        System.out.println(list);
    }

    @Override
    @Transactional
    public String zz() {
        userDao.jianshaoMoney("符程博",-500);
//       int i=1/0;
        System.out.println("爱红艳");
        userDao.addMoney("赵红艳",500);
        return "转账成功";
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setName(String name) {
        this.name = name;
    }


}
