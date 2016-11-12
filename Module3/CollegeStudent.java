package Module3;

/**
 * Created by Owner on 11/11/2016.
 */
public class CollegeStudent extends Student {
  public String collegeName;
  public int rating;
  public long id;

  private void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }

  private void setRating(int rating) {
    this.rating = rating;
  }

  private void setId(long id) {
    this.id = id;
  }

  private String getCollegeName() {

    return collegeName;
  }

  private int getRating() {
    return rating;
  }

  private long getId() {
    return id;
  }

  public CollegeStudent(String collegeName, int rating, long id){
    this.firstName = firstName;
    this.lastName =lastName;
    this.group = group;
    this.lastName = lastName;
    this.coursesTaken = coursesTaken;
    this.collegeName = collegeName;
    this.rating = rating;
    this.id = id;
  }

  public CollegeStudent() {
  }
}
