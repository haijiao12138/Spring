package com.haijiao12138.demo.spring.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author: haijiao12138
 * @ClassName: BeanLifeCycle
 * @description: TODO
 * @date: 2021/8/16 12:12
 */
public class BeanLifeCycle {
    public static void main(String[] args) {

               System.out.println("现在开始初始化容器------------------------------");

               ApplicationContext factory = new ClassPathXmlApplicationContext("beans.xml");
                System.out.println("容器初始化成功--------------------------------");
                //得到Preson，并使用
               Person person = factory.getBean("person",Person.class);
                 System.out.println(person);

               System.out.println("现在开始关闭容器！------------------------------");
                ((ClassPathXmlApplicationContext)factory).registerShutdownHook();
            }
}
