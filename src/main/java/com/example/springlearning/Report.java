package com.example.springlearning;

public class Report implements Report_Creation{
  @Override
  public String getReport() {
    return "This is the report presentation";
  }
}
