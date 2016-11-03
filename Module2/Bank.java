package Module2;

/**
 * Created by Owner on 11/3/2016.
 */
public class Bank {
  public static void main(String[] args) {
    // Create an account
    Account customer1 = new Account();

    customer1.withdraw(150);
    System.out.println("Customer1 has a balance of ");

    System.out.println(customer1.getBalance());




  }
}
