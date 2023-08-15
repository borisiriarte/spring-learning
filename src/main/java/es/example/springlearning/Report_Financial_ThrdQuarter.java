package es.example.springlearning;

import org.springframework.stereotype.Component;

@Component
public class Report_Financial_ThrdQuarter implements Report_Financial{
  @Override
  public String getFinancialReport() {
    return "Favorable third quarter report presentation";
  }
}
