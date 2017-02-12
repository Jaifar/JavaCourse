package Module4;

/**
 * Created by Owner on 2/9/2017.
 */
public interface BankSystem {

  void withdrawOfUser(User user, int amount);
  void fundUser(User user, int amount);
  void transferMoney(User fromUser, User toUser, int amount);
  void paySalary(User user);
}
