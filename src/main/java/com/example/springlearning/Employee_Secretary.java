package com.example.springlearning;

public class Employee_Secretary implements Employee{
  private Report_Creation newReport;
  private String email;
  private String companyName;

  public void setNewReport(Report_Creation newReport) {
    this.newReport = newReport;
  }

  @Override
  public String getTasks() {
    return "I manage the bosses' agenda";
  }

  @Override
  public String getReport() {
    return "Report made by the secretary: " + newReport.getReport();
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
