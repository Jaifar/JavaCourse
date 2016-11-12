package Module3;

import java.util.Date;

/**
 * Created by Owner on 11/11/2016.
 */
public class Course {



  private Date startDate ;
  private String name ;
  private int hoursDuration;
  private String teacherName ;

  //Создайте 2 конструктора с аргументами
  public Course(Date startDate, String name, int hoursDuration, String teacherName){
    this.startDate = startDate;
    this.name = name;
    this.hoursDuration = hoursDuration;
    this.teacherName = name;
  }
public Date getStartDate(){
  return this.startDate;
}
public String getName(){
  return  this.name;

}
  private int getHoursDuration() {
    return hoursDuration;
  }

  private String getTeacherName() {
    return teacherName;
  }

  private void setStartDate(Date startDate) {
    this.startDate = startDate;
  }

  private void setName(String name) {
    this.name = name;
  }

  private void setHoursDuration(int hoursDuration) {
    this.hoursDuration = hoursDuration;
  }

  private void setTeacherName(String teacherName) {
    this.teacherName = teacherName;
  }
}
