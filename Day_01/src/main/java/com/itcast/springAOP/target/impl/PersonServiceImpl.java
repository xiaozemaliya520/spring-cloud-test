package com.itcast.springAOP.target.impl;

import com.itcast.springAOP.target.PersonService;
import org.springframework.stereotype.Service;

@Service("PersonService")
public class PersonServiceImpl  {

    public void show() {
        System.out.println("赵红艳，我好爱你呀！！");
    }
}
