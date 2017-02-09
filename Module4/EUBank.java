package Module4;

/**
 * Created by Owner on 1/27/2017.
 */
public class EUBank extends Bank {
  EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
    super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
  }

  @Override
    // EUBank: limit of withdrawal = 2000 if currency is USD and 2200 if currency is EUR
  int getLimitOfWithdrawal() {
    if (currency == Currency.USD)
      return 2000;
    if (currency == Currency.EUR)
      return 2200;
    return 0;
  }

  @Override
    //limit of funding - 20000 if EUR and 10000 if USD
  int getLimitOfFunding() {
    if (currency == Currency.EUR)
      return 20000;
    if (currency == Currency.USD)
      return 10000;
    return 0;


  }

  @Override
    //monthly rate - 0% with USD and 1% with EUR
  int getMonthlyRate() {
    if (currency == Currency.USD)
      return 0;
    if (currency == Currency.EUR)
      return 1;
    return 0;
  }

  @Override
    //commision - 5% if USD and up to 1000, 7% if USD and more than 1000
  int getCommission(int summ) {
    if (currency == Currency.USD) {
      if (summ <= 1000)
        return 5;
      else
        return 7;
    }

    //       2% if EUR and up to 1000 and 4% if EUR and more than 1000
    if (currency == Currency.EUR) {
      if (summ <= 100)
        return 2;
      else
        return 4;
    }
    return 0;
  }


  @Override
  double moneyPaidMonthlyForSalary() {

    return 0;
  }
}







