package com.itcast.springIOC.dao;

public interface UserDao {
    public void init();
    public void show();
    public void destory();
    public String  addMoney(String name,Integer  money);
    public String  jianshaoMoney(String name,Integer money);
}
