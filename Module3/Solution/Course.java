package Module3.Solution;

/**
 * Created by Owner on 1/12/2017.
 */
public class Course {
  // Создать следующую структуру классов.
  int startDate;
  String name;
  int hoursDuration;
  String teacherName;

  public Course(int startDate, String name) {
    this.startDate = startDate;
    this.name = name;
  }


  public Course( String name, int hoursDuration, String teacherName) {
    this.name = name;
    this.hoursDuration = hoursDuration;
    this.teacherName = teacherName;
  }

  public int getStartDate() {
    return startDate;
  }

  public void setStartDate(int startDate) {
    this.startDate = startDate;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getHoursDuration() {
    return hoursDuration;
  }

  public void setHoursDuration(int hoursDuration) {
    this.hoursDuration = hoursDuration;
  }

  public String getTeacherName() {
    return teacherName;
  }

  public void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }

  //Класс Course с полями:
  //Date startDate,
  //String name,
  //int hoursDuration,
  //String teacherName.
  //Создайте 2 конструктора с аргументами
  //startDate, name;
  //hourseDuration, name, teacherName.

  //Класс Student с полями:
  //String firstName,
  //String lastName,
  //int group,
  // Course[] coursesTaken,
  // int age.
  //С 2 конструкторами с аргументами
  //  firstName, lastName, group;
  //lastName, coursesTaken.

  // CollegeStudent унаследован от Student.
  // Дополнительные поля: String collegeName, int rating, long id.
  // Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.

  // Class SpecialStudent унаследован от CollegeStudent.
  //Дополнительные поля long secretKey, String email.
  // Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.

  // Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
  // Создайте 5 объектов класса Course. Создайте объекты других классов, используя все конструкторы.
  //У вас должно быть 13 объектов в классе Solution.
}
