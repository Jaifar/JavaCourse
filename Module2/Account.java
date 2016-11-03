package Module2;

/**
 * Created by Owner on 11/3/2016.
 */
public class Account {
  private double balance;
  // Stet balance to 600
  public  Account(){
    balance =100;

  }

  //Withdraw
  public void withdraw (double amount ) {
    balance = balance - (amount*0.05);
    if(amount<=balance){
      balance=balance-amount;
    }
else{
      System.out.println("transaction cancelled");
    }

  }
  //

  //Get balance
  public double getBalance(){
    return balance ;
  }
}
