package com.itcast.springIOC.dao.impl;


import com.itcast.springIOC.dao.UserDao;

public class FactoryBean {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
