package com.example.prototype;

import com.example.springlearning.Employee_Secretary;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseProtorype {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:beanP.xml");

    Employee_Secretary Boris = ctx.getBean("secretaryCtx", Employee_Secretary.class);
    Employee_Secretary Ann = ctx.getBean("secretaryCtx", Employee_Secretary.class);
    System.out.println(Boris);
    System.out.println(Ann);
  }
}
