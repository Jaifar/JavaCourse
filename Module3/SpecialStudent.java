package Module3;

/**
 * Created by Owner on 11/11/2016.
 */
public class SpecialStudent extends CollegeStudent {
  /*
  getter method it is a method with return type other than void
  that will return the values of different attributes
  setter method it is a method with return type void that will set attribute based on the argument we pass
  in
  */
  private long secretKey;
  private String email;

  public SpecialStudent( long secretKey, String email){
    this.collegeName = collegeName;
    this.rating = rating;
    this.id = id;
    this.secretKey = secretKey;
    this.email = email;
  }

  private void setSecretKey(long secretKey) {
    this.secretKey = secretKey;
  }

  private void setEmail(String email) {
    this.email = email;
  }

  private long getSecretKey() {

    return secretKey;
  }

  private String getEmail() {
    return email;
  }
}
