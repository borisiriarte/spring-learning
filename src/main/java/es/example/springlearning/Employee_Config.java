package es.example.springlearning;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("es.example.springlearning")
@PropertySource("classpath:application.properties")
public class Employee_Config {
  // Define bean - SalesDpt FinancialReport
  @Bean
  public Report_Financial report_Financial_SalesDpt() {
    return new Report_Financial_SalesDpt();
  }

  // Define bean - FinancialManager and dependency injection
  @Bean
  public Employee employee_FinancialManager(){
    return new Employee_FinancialManager(report_Financial_SalesDpt());
  }
}
