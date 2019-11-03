package com.itcast.dao;

import com.itcast.springIOC.pojo.City;
import com.itcast.springIOC.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserDaoTest01 {
    @Autowired
    private UserService userService;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Test
    public void show(){
        String sql="select * from city";
        List<City> cityList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(City.class));
        for (City city : cityList) {
            System.out.println(city);
        }
    }
    @Test
    public void show2(){
        String sql="select count(city_id) from city";
        Integer i = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(i);
    }
    @Test
    public void show3(){
        String sql="select * from city where city_id=?";
        City city = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<City>(City.class), 1);

        System.out.println(city);
    }
    @Test
    public void show6(){
        userService.zz();
    }

}
