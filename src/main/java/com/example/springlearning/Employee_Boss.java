package com.example.springlearning;

public  class Employee_Boss implements Employee {

  @Override
  public String getTasks() {
    return "I manage the issues related to my section employees.";
  }

  @Override
  public String getReport() {
    return null;
  }
}
