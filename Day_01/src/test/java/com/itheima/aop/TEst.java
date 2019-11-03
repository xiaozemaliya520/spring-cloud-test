package com.itheima.aop;

        import com.itcast.springAOP.target.PersonService;
        import com.itcast.springAOP.target.impl.PersonServiceImpl;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TEst {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        PersonServiceImpl service = (PersonServiceImpl) applicationContext.getBean("PersonService");

        service.show();
    }
}
