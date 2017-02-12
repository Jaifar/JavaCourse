package Module4;

/**
 * Created by Owner on 1/31/2017.
 */
public class User {
  private long id;
  private String name;
  private double balance;
  private int monthsOfEmployment;
  private String companyName;
  private int salary;
  private Bank bank;

  public User(long id, String name, double balance, int monthsOfEmployment, String companyName, int salary, Bank bank) {
    this.id = id;
    this.name = name;
    this.balance = balance;
    this.monthsOfEmployment = monthsOfEmployment;
    this.companyName = companyName;
    this.salary = salary;
    this.bank = bank;
  }

  public String toString() {
    return null;
  }
}