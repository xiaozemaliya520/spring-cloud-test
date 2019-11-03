package com.itcast.springAOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
    @Before(value = "execution(* com..*(..))")
    public void before(){
        System.out.println("希望能够面试成功！！");
    }
}
