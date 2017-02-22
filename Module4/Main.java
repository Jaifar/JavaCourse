package Module4;

/**
 * Created by Owner on 2/11/2017.
 */
public class Main {


  public static void main(String[] args) {
    //создать 6 объектов класса User (2 - USBank, 2 - EUBank, 2 - ChinaBank)
    USBank usBank = new USBank(0, "USA", Currency.USD, 23, 122000, 12, 10000);
    User user = new User(23, "F", 23, 12, "JJ", 1234, usBank);
    // Run four different operations with erery User’s baalance and print its objects to console.
  }
}
