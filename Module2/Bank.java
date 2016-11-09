package Module2;

/**
 * Created by Owner on 11/3/2016.
 */
public class Bank {
  public static void main(String[] args) {
    // Create an account
    Account Ann = new Account();

    
    Ann.deposit(340);
    System.out.println("Ann  has a balance of ");

    System.out.println(Ann.getBalance());



  }
}
