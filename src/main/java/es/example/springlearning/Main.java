package es.example.springlearning;  

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
  public static void main(String[] args) {
    ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    Employee Boris = ctx.getBean("employee_SeniorSalesman", Employee.class);

    System.out.println(Boris.getTasks());
    System.out.println(Boris.getReport());

    ctx.close();
  }
}
