package es.example.springlearning;

import org.springframework.stereotype.Component;

@Component
public class Report_Financial_FrthQuarter implements Report_Financial{
  @Override
  public String getFinancialReport() {
    return "Year closure report presentation";
  }
}
