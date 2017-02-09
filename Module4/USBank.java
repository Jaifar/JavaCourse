package Module4;

/**
 * Created by Owner on 1/27/2017.
 */
public class USBank extends Bank {
  private USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
    super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
  }

  @Override
    ///USBank: лимит снятия = 1000, если валюта - USD, и 1200 если валюта - EUR
  int getLimitOfWithdrawal() {
    if (currency == Currency.USD)
      return 1000;
    if (currency == Currency.EUR)
      return 1200;
    return 0;
  }

  @Override
    //лимит пополнения - 10000 если EUR, и нет лимита если USD
  int getLimitOfFunding() {
    if (currency == Currency.EUR)
      return 10000;
    if (currency == Currency.USD)
      return Integer.MAX_VALUE;
    return 0;


  }

  @Override
    //месячная ставка - 1% на USD и 2% на EUR
  int getMonthlyRate() {
    if (currency == Currency.USD)
      return 1;
    if (currency == Currency.EUR)
      return 2;
    return 0;
  }

  @Override
    // комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
    //     6%, если EUR и до 1000 и 8%, если EUR и больше 1000
  int getCommission(int summ) {
    if (currency == Currency.USD) {
      if (summ <= 1000)
        return 5;
      else
        return 7;
    }
    if (currency == Currency.EUR) {
      if (summ <= 100)
        return 6;
      else
        return 8;
    }
    return 0;
  }


  @Override
  double moneyPaidMonthlyForSalary() {
    return 0;
  }
}



