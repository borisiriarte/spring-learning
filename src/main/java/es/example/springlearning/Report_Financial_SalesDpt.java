package es.example.springlearning;

public class Report_Financial_SalesDpt implements Report_Financial{
  @Override
  public String getFinancialReport() {
    return "2018, Sales Department financial report";
  }
}
