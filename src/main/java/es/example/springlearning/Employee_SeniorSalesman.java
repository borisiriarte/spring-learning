package es.example.springlearning;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Employee_SeniorSalesman implements Employee {
  @Autowired
  @Qualifier("report_Financial_ScndQuarter")
  private Report_Financial nReport;

  /*@Autowired
  public Employee_SeniorSalesman(Report_Financial report) {
    this.report = report;
  }*/

  @Override
  public String getTasks() {
    return "Sell, sell, more selling";
  }

  @Override
  public String getReport() {
    return nReport.getFinancialReport();
  }

  /*@Autowired
  public void setnReport(Report_Financial nReport) {
    this.nReport = nReport;
  }*/
}
