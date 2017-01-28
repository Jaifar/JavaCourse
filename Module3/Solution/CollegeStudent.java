package Module3.Solution;

/**
 * Created by Owner on 1/12/2017.
 */
public class CollegeStudent extends Student {


  //ollegeStudent унаследован от Student.
  // Дополнительные поля: String collegeName, int rating, long id.
  // Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.
  private String collegeName;
  private int rating;
  private long id;

  public CollegeStudent(String lastName) {
    super("HH", "jj", 9);
  }

  public CollegeStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
    super(firstName, lastName, group);
    this.collegeName = collegeName;
    this.rating = rating;
    this.id = id;
  }

  public CollegeStudent(String lastName, Course[] coursesTaken, String collegeName, int rating, long id) {
    super(lastName, coursesTaken);
    this.collegeName = collegeName;
    this.rating = rating;
    this.id = id;
  }

  public CollegeStudent(String firstName, String lastName, int group) {
    super(firstName, lastName, group);
  }

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
}
