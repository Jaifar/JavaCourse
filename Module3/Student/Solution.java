package Module3.Student;

import java.util.Date;

/**
 * Created by Owner on 11/12/2016.
 */
public class Solution {
  public String collegeName;
  public int rating;
  public long id;
  private Date startDate ;
  private String name ;
  private int hoursDuration;
  private String teacherName ;
  private long secretKey;
  private String email;
  public String firstName;
  public String lastName;
  public int group;
  public Course[] coursesTaken;

  private String getCollegeName() {
    return collegeName;
  }

  private void setCollegeName(String collegeName) {
    this.collegeName = collegeName;
  }

  private int getRating() {
    return rating;
  }

  private void setRating(int rating) {
    this.rating = rating;
  }

  private long getId() {
    return id;
  }

  private void setId(long id) {
    this.id = id;
  }

  private Date getStartDate() {
    return startDate;
  }

  private void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  private String getName() {
    return name;
  }

  private void setName(String name) {
    this.name = name;
  }

  private int getHoursDuration() {
    return hoursDuration;
  }

  private void setHoursDuration(int hoursDuration) {
    this.hoursDuration = hoursDuration;
  }

  private String getTeacherName() {
    return teacherName;
  }

  private void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }

  private long getSecretKey() {
    return secretKey;
  }

  private void setSecretKey(long secretKey) {
    this.secretKey = secretKey;
  }

  private String getEmail() {
    return email;
  }

  private void setEmail(String email) {
    this.email = email;
  }

  private String getFirstName() {
    return firstName;
  }

  private void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  private String getLastName() {
    return lastName;
  }

  private void setLastName(String lastName) {
    this.lastName = lastName;
  }

  private int getGroup() {
    return group;
  }

  private void setGroup(int group) {
    this.group = group;
  }

  private Course[] getCoursesTaken() {
    return coursesTaken;
  }

  private void setCoursesTaken(Course[] coursesTaken) {
    this.coursesTaken = coursesTaken;
  }

  private Solution(String collegeName, int rating, long id, Date startDate, String name, int hoursDuration, String teacherName,
                  long secretKey, String email, String firstName, String lastName, int group, Course[] coursesTaken) {
    this.collegeName = collegeName;
    this.rating = rating;
    this.id = id;
    this.startDate = startDate;
    this.name = name;
    this.hoursDuration = hoursDuration;
    this.teacherName = teacherName;
    this.secretKey = secretKey;
    this.email = email;
    this.firstName = firstName;
    this.lastName = lastName;
    this.group = group;
    this.coursesTaken = coursesTaken;
  }
}
