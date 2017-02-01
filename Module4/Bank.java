package Module4;

import java.util.Currency;

/**
 * Created by Owner on 1/27/2017.
 */
public abstract class Bank {
  //Создайте следующую структуру:
  /////1. Абстрактный класс Bank и 3 класса, которые его расширяют: USBank, EUBank, ChinaBank.

  //Абстрактный класс Bank должен содержать поля:
  //long id
  //String bankCountry
  //Currency currency
  //int numberOfEmployees
  //double avrSalaryOfEmployee
  //long rating
  //long totalCapital

  //Создайте get-,set-методы и конструктор с аргументами - всеми полями.
  //Методы:
//abstract int getLimitOfWithdrawal()
//abstract int getLimitOfFunding()
//abstract int getMonthlyRate()
//abstract int getCommission(int summ)
  //       double moneyPaidMonthlyForSalary()
  private long id;
  private String bankCountry;
  private Currency currency;
  private int numberOfEmployees;
  private double avrSalaryOfEmployee;
  private long rating;
  private long totalCapital;
  public enum Currency { USD, EUR };




  private Bank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
    this.id = id;
    this.bankCountry = bankCountry;
    this.currency = currency;
    this.numberOfEmployees = numberOfEmployees;
    this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    this.rating = rating;
    this.totalCapital = totalCapital;
  }

  private long getId() {
    return id;
  }

  private void setId(long id) {
    this.id = id;
  }

  private String getBankCountry() {
    return bankCountry;
  }

  private void setBankCountry(String bankCountry) {
    this.bankCountry = bankCountry;
  }

  private Currency getCurrency() {
    return currency;
  }

  private void setCurrency(Currency currency) {
    this.currency = currency;
  }

  private int getNumberOfEmployees() {
    return numberOfEmployees;
  }

  private void setNumberOfEmployees(int numberOfEmployees) {
    this.numberOfEmployees = numberOfEmployees;
  }

  private double getAvrSalaryOfEmployee() {
    return avrSalaryOfEmployee;
  }

  private void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
    this.avrSalaryOfEmployee = avrSalaryOfEmployee;
  }

  private long getRating() {
    return rating;
  }

  private void setRating(long rating) {
    this.rating = rating;
  }

  private long getTotalCapital() {
    return totalCapital;
  }

  private void setTotalCapital(long totalCapital) {
    this.totalCapital = totalCapital;
  }

  abstract int getLimitOfWithdrawal();

  abstract int getLimitOfFunding();

  abstract int getMonthlyRate();

  abstract int getCommission(int summ);

  abstract double moneyPaidMonthlyForSalary();

}