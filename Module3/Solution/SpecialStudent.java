package Module3.Solution;

/**
 * Created by Owner on 1/12/2017.
 */
public class SpecialStudent extends CollegeStudent {


  private String email;
  private long secretKey;

  public SpecialStudent(String lastName, Course[] coursesTaken, String email, long secretKey) {
    super(lastName);
    this.email = email;
    this.secretKey = secretKey;
  }

  public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id, String email, long secretKey) {
    super(firstName, lastName, group, collegeName, rating, id);
    this.email = email;
    this.secretKey = secretKey;
  }

  public SpecialStudent(String firstName, String lastName, int group, String email, long secretKey) {
    super(firstName, lastName, group);
    this.email = email;
    this.secretKey = secretKey;
  }
  private String getEmail() {
    return email;
  }

  private void setEmail(String email) {
    this.email = email;
  }

  private long getSecretKey() {
    return secretKey;
  }

  private void setSecretKey(long secretKey) {
    this.secretKey = secretKey;
  }

}
