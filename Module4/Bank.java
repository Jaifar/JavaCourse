package Module4;

import static Module4.Currency.*;

/**
 * Created by Owner on 11/29/2016.
 */
abstract public class Bank  {
// the the attributes
  private long id;
  private String bankCountry;

  private int numberOfEmployees;
  double avrSalaryOfEmployee;
  long rating;
  long totalCapital;
  private int limitWithdraw;
  private int limitDeposit;
  private int monthComission;
  String currency;
  // the methods

  // constructor
  public Bank (long id, String bankCountry, Currency currency,int numberOfEmployees ){



  }
  // methods to read the attributes
  public void deposit(double amount){

  }
  public void withdraw (double amount){

  }
  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }

  public String getBankCountry() {
    return bankCountry;
  }

  public void setBankCountry(String bankCountry) {
    this.bankCountry = bankCountry;
  }

  public Currency getCurrency() {
    return currency;
  }

  public void setCurrency(Currency currency) {
    this.currency = currency;
  }

  public int getNumberOfEmployees() {
    return numberOfEmployees;
  }

  public void setNumberOfEmployees(int numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  public double getAvrSalaryOfEmployee() {
    return avrSalaryOfEmployee;
  }

  public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
    this.avrSalaryOfEmployee = avrSalaryOfEmployee;
  }

  public long getRating() {
    return rating;
  }

  public void setRating(long rating) {
    this.rating = rating;
  }

  public long getTotalCapital() {
    return totalCapital;
  }

  public void setTotalCapital(long totalCapital) {
    this.totalCapital = totalCapital;
  }}
// methods to deposit and withdraw money
