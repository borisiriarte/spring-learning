package es.example.springlearning;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStructures {
  public static void main(String[] args) {
    /*ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");*/
    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Employee_Config.class);

    Employee employee = ctx.getBean("employee_FinancialManager", Employee.class);
    System.out.println(employee.getTasks());
    System.out.println(employee.getReport());
    /*Employee Boris = ctx.getBean("employee_SeniorSalesman", Employee.class);
    Employee Anna = ctx.getBean("employee_SeniorSalesman", Employee.class);

    System.out.println(Boris == Anna ? "This is correct" : "I don't think so");
    System.out.println(Boris + "\n" + Anna);*/

    ctx.close();
  }
}
