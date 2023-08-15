package es.example.springlearning;

import org.springframework.stereotype.Component;

@Component
public class Report_Financial_FstQuarter implements Report_Financial{
  @Override
  public String getFinancialReport() {
    return "First quarter financial report presentation";
  }
}
