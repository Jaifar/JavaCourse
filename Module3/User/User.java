package Module3.User;

/**
 * Created by Owner on 1/12/2017.
 */
public class User {


  public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
    this.name = name;
    this.balance = balance;
    this.monthsOfEmployment = monthsOfEmployment;
    this.companyName = companyName;
    this.salary = salary;
    this.currency = currency;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getBalance() {
    return balance;
  }

  public void setBalance(int balance) {
    this.balance = balance;
  }

  public int getMonthsOfEmployment() {
    return monthsOfEmployment;
  }

  public void setMonthsOfEmployment(int monthsOfEmployment) {
    this.monthsOfEmployment = monthsOfEmployment;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public int getSalary() {
    return salary;
  }

  public void setSalary(int salary) {
    this.salary = salary;
  }

  public String getCurrency() {
    return currency;
  }

  private void setCurrency(String currency) {
    this.currency = currency;
  }

  private String companyName;
  private int salary;
  private String currency;
  private String name;
  private int balance;
  private int monthsOfEmployment;


  //Создайте get-, set-методы и конструктор с аргументами - всеми полями класса.
  //Напишите методы:
  //void paySalary() - добавляет заработную плату к балансу пользователя
  //withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
  // companyNameLenght - вычисляет длину имя компании
  // monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth

  public void paySalary(){
    balance += salary;
  }
  public void withdraw(int summ) {

    if (summ < 1000) {
      balance -= summ+(summ * 0.05);
    } else {
      balance -= summ+ (summ * 0.1);
    }
  }

  public void companyNameLenght() {
    companyName.length();

  }

  public void monthIncreaser(int addMonth){
    monthsOfEmployment+=addMonth;
  }
}
