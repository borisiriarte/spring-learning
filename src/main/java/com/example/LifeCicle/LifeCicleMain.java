package com.example.LifeCicle;

import com.example.springlearning.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCicleMain {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beanLifeCicle.xml");
    Employee Boris = ctx.getBean("managerCtx", Employee.class);

    System.out.println(Boris.getReport());
    ctx.close();
  }
}
