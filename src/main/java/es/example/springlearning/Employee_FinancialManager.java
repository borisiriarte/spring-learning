package es.example.springlearning;

import org.springframework.beans.factory.annotation.Value;

public class Employee_FinancialManager implements Employee{
  private Report_Financial financialReport;
  @Value("${email}")
  private String email;
  @Value("${companyName}")
  private String companyName;

  public Employee_FinancialManager(Report_Financial financialReport) {
    this.financialReport = financialReport;
  }

  public String getEmail() {
    return email;
  }

  public String getCompanyName() {
    return companyName;
  }

  @Override
  public String getTasks() {
    return "Management and direction of the company financial operations";
  }

  @Override
  public String getReport() {
    return financialReport.getFinancialReport();
  }
}
