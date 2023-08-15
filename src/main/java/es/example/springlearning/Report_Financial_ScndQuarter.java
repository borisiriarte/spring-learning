package es.example.springlearning;

import org.springframework.stereotype.Component;

@Component
public class Report_Financial_ScndQuarter implements Report_Financial{
  @Override
  public String getFinancialReport() {
    return "Catastrophic second quearter report presentation";
  }
}
