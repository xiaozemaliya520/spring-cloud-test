package com.itcast.springIOC.dao.impl;


import com.itcast.springIOC.dao.UserDao;
import com.itcast.springIOC.dao.impl.UserDaoImpl;

public class StaticFactoryBean {
    public  static UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
