package com.example.springlearning;

public class Employee_Manager implements Employee {

  private Report_Creation newReport;
  private String email;
  private String companyName;

  // Metodo Init
  public void init() {
    System.out.println("Inside init method. Here would be the task to be executed before bean is ready.");
  }
  // Metodo Destroy
  public void destroy() {
    System.out.println("Inside destroy method. Here would be the task to be executed after bean is ready.");
  }
  public Employee_Manager(Report_Creation newReport) {
    this.newReport = newReport;
  }

  @Override
  public String getTasks() {
    return "I manage many things inside the company";
  }

  @Override
  public String getReport() {
    return "Report Created by the manager: " + newReport.getReport();
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }
}
