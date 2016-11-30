package Module2;

/**
 * Created by Owner on 11/3/2016.
 */
public class Account {
  private double balance;
  // Set balance to 600
  public  Account(){
    balance =2;

  }

  //Withdraw
  public void withdraw (double amount ) {
    balance = balance - (amount*0.05);
    if(amount<=balance){
      balance=balance-amount;
    } else{
      System.out.println("transaction cancelled");
    }

  }
  //

  //Get balance
  public double getBalance(){
    return balance ;
  }



//deposit

  public void deposit(double amount) {
    balance = balance + amount;
    System.out.println("Ann has balance of ");}}
