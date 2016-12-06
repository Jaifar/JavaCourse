package Module4;

/**
 * Created by Owner on 11/29/2016.
 */
public class USBank extends Bank {

  public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees) {
    super(id, bankCountry, currency, numberOfEmployees);
  }


   int limitWithdraw;
   int limitDeposit;
   int monthCommission;
   int monthFee;


 if(currency.equals("USD")){
    limitWithdraw = 100;
  }

else if  (currency.equals("EUR")){
    limitWithdraw = 1200;

  }

else if  (currency.equals("EUR"){
    limitDeposit = 10000;
  }
  else if(currency.equals("USD")){
    monthCommission = 1;
  }
  else if  (currency.equals("EUR"){
    monthCommission = 2;
  }
  if(currency.equals("USD")){
    else (limitWithdraw < 1000);
      monthFee = 5;
    else ( limitDeposit > 1000);
      monthFee = 7;


  }
}




