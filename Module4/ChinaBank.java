package Module4;

/**
 * Created by Owner on 1/31/2017.
 */
public class ChinaBank extends Bank {
  ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
    super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
  }

  @Override
    //ChinaBank: limit of withdrawal = 100 if currency is USD and 150 if currency is EUR
  int getLimitOfWithdrawal() {
    if (currency == Currency.USD)
      return 100;
    if (currency == Currency.EUR)
      return 150;
    return 0;
  }

  @Override
    //    limit of funding - 5000 if EUR and 10000 if USD
  int getLimitOfFunding() {
    if (currency == Currency.EUR)
      return 5000;
    if (currency == Currency.USD)
      return 10000;
    return 0;


  }

  @Override
    //   monthly rate - 1% with USD and 0% with EUR
  int getMonthlyRate() {
    if (currency == Currency.USD)
      return 1;
    if (currency == Currency.EUR)
      return 2;
    return 0;
  }

  @Override
    //   commision - 3% if USD and up to 1000, 5% if USD and more than 1000
  int getCommission(int summ) {
    if (currency == Currency.USD) {
      if (summ <= 1000)
        return 3;
      else
        return 5;
    }
    //   10% if EUR and up to 1000 and 11% if EUR and more than 1000
    if (currency == Currency.EUR) {
      if (summ <= 1000)
        return 10;
      else
        return 11;
    }
    return 0;
  }


  @Override
  double moneyPaidMonthlyForSalary() {
    return 0;
  }
}




