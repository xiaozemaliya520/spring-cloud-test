package com.itcast.springIOC.dao.impl;


import com.itcast.springIOC.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void init() {
        System.out.println("我被创建啦！！么么哒");
    }

    @Override
    public void show() {
        System.out.println("我爱赵红艳");

    }

    @Override
    public void destory() {
        System.out.println("我要挂啦  m");
    }

    @Override
    public String addMoney(String name, Integer money) {
        String sql="update account  set   money =money+?   where name=?";
        jdbcTemplate.update(sql,money,name);
        return "账户增加了"+money+"元";
    }

    @Override
    public String jianshaoMoney(String name, Integer money) {
        String sql="update account  set   money =money+?   where name=?";
        jdbcTemplate.update(sql,money,name);
        return "账户减少了"+money+"元";
    }
}


