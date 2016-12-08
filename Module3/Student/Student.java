package Module3.Student;

/**
 * Created by Owner on 11/11/2016.
 */
public class Student {



  public String firstName;
  public String lastName;
  public int group;
  public Course[] coursesTaken;

  private String getFirstName() {
    return firstName;
  }

  private String getLastName() {
    return lastName;
  }

  private int getGroup() {
    return group;
  }

  private Course[] getCoursesTaken() {
    return coursesTaken;
  }

  private int getAge() {
    return age;
  }

  private int age;
  private void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  private void setLastName(String lastName) {
    this.lastName = lastName;
  }

  private void setGroup(int group) {
    this.group = group;
  }

  private void setCoursesTaken(Course[] coursesTaken) {
    this.coursesTaken = coursesTaken;
  }

  private void setAge(int age) {
    this.age = age;
  }

public Student (String firstName, String lastName, int group, Course[] coursesTaken, int age ){
  this.firstName = firstName;
  this.lastName =lastName;
  this.group = group;
  this.lastName = lastName;
  this.coursesTaken = coursesTaken;
}

  public Student() {
  }
}
