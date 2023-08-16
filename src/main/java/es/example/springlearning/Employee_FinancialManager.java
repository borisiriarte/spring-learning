package es.example.springlearning;

public class Employee_FinancialManager implements Employee{
  private Report_Financial financialReport;

  public Employee_FinancialManager(Report_Financial financialReport) {
    this.financialReport = financialReport;
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
