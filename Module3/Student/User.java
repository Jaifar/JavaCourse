package Module3.Student;

/**
 * Created by Owner on 11/13/2016.
 */
public class User {


  private final String name
          ;
  private final int monthsOfEmployment;
  private double balance;
  private final String companyName;
  private final String currency;
  private final int salary;

  public static void main(String[] args) {
    String name = "Tetiana";
    int balance = 1000;
    int monthsOfEmployment = 12;
    String companyName = "Medusa";
    int salary = 1500;
    String currency ="dollars";
  }

  public String getName() {
    return name;
  }

  public int getMonthsOfEmployment() {
    return monthsOfEmployment;
  }

  public int getBalance() {
    return (int) balance;
  }

  public String getCompanyName() {
    return companyName;
  }

  public String getCurrency() {
    return currency;
  }

  public int getSalary() {
    return salary;
  }

  public User(String name,
              int balance,
              int monthsOfEmployment,
              String companyName,
              int salary,
              String currency) {
    this.name = name;
    this.monthsOfEmployment =monthsOfEmployment;
    this.balance = balance;
    this.companyName = companyName;
    this.currency = currency;
    this.salary = salary;

  }
  //salary + balance
  public void paySalary(int salary ){
    balance = balance + salary;


  }
  //снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях


public void withdraw(int summ){
if (balance <= 100){
  balance = balance -(summ*0.05);
} else{
  balance = balance -(summ * 0.1);
}}
// вычисляет длину имя компании
  public void companyNameLenght(int length){
    length = companyName.length();

  }
  //увеличивает monthsOfEmployment на addMonth
  public void monthIncreaser(int addMonth){
    int monthIncreaser = monthsOfEmployment + addMonth;

  }
}

