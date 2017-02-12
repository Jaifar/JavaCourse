package Module4;

/**
 * Created by Owner on 2/11/2017.
 */
public class Main {


  public static void main(String[] args) {
    //создать 6 объектов класса User (2 - USBank, 2 - EUBank, 2 - ChinaBank)
    USBank usBank = new USBank(12, "China", Currency.EUR, 12, 6700, 122, 1222);
    USBank usBank1 = new USBank(12, "The USA", Currency.USD, 34, 4500, 67, 45);

    EUBank euBank = new EUBank(23, "France", Currency.EUR, 124, 45, 78, 67);
    EUBank euBank1 = new EUBank(34, "England", Currency.EUR, 34, 56, 78, 90);

    ChinaBank chinaBank = new ChinaBank(34, "China", Currency.USD, 45, 56, 78, 56);
    ChinaBank chinaBank1 = new ChinaBank(34, "Mongolia", Currency.USD, 45, 67, 78, 90);
    // Run four different operations with erery User’s baalance and print its objects to console.
    chinaBank.getCommission(90);

    chinaBank1.getLimitOfFunding();
    System.out.println("In China bank limits is " + chinaBank.getLimitOfFunding());
    usBank.moneyPaidMonthlyForSalary();
    System.out.println("In the USA bank salary is " + usBank.moneyPaidMonthlyForSalary());
    usBank1.getAvrSalaryOfEmployee();
    System.out.println("In the USA bank average salary is " + usBank1.getAvrSalaryOfEmployee());
    euBank.getAvrSalaryOfEmployee();
    System.out.println("In the EU bank verage salary is " + euBank.getAvrSalaryOfEmployee());
    euBank1.getCurrency();
    System.out.println("In the EU bank currency is " + euBank1.currency);

  }
}
