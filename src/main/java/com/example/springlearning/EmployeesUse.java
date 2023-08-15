package com.example.springlearning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeesUse {
  public static void main(String[] args) {

    // Create Employees Type Object
    /*Employee boss = new Employee_Boss();
    Employee secretary = new Employee_Secretary();
    Employee principal = new Employee_Principal();*/

    // Created Objects Use
    /*System.out.println(boss.getTasks());
    System.out.println(secretary.getTasks());*/

    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    Employee Boris = ctx.getBean("employeeCtx", Employee.class);
    System.out.println(Boris.getTasks());
    System.out.println(Boris.getReport());

    System.out.println("///////////////////////////");

    Employee_Secretary Rosa = ctx.getBean("secretaryCtx", Employee_Secretary.class);
    System.out.println(Rosa.getTasks());
    System.out.println(Rosa.getReport());
    System.out.println(Rosa.getCompanyName());
    System.out.println(Rosa.getEmail());
    ctx.close();
  }
}
