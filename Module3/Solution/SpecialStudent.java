package Module3.Solution;

/**
 * Created by Owner on 1/12/2017.
 */
public class SpecialStudent extends CollegeStudent {


  private String email;
  private long secretKey;


  public SpecialStudent(String firstName, String lastName, int group) {
    super(firstName, lastName, group);
  }
  public SpecialStudent(String lastName, Course[] coursesTaken){
    super(lastName, coursesTaken);
  }
  public SpecialStudent(long secretKey, String firstName, String lastName, int group){
    super(firstName, lastName, group);
    this.secretKey = secretKey;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public long getSecretKey() {
    return secretKey;
  }

  public void setSecretKey(long secretKey) {
    this.secretKey = secretKey;
  }

}
