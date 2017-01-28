package Module3.Solution;

import javax.lang.model.element.Name;

/**
 * Created by Owner on 1/25/2017.
 */
public class SolutionMain {
  public static void main(String[] args) {
    Course[] crArrays = new Course[3];
    crArrays[0] = new Course("math", 3, "Ivanko");
    crArrays[1] = new Course("English", 5, "Nicolau");


    Course course = new Course("Match",12,"Tom");
    Course course1 = new Course(12,"Bob");

    Student student = new Student("Smith", "Logan",3);
    Student student1 = new Student("GGG",crArrays);

    CollegeStudent collegeStudent = new CollegeStudent("Anna", "Kovalenko", 4);
    CollegeStudent collegeStudent1 = new CollegeStudent("Helena", "Kdanska", 12, "MUI",1,2);
    CollegeStudent collegeStudent2 = new CollegeStudent("Kolesnik","French",20);
    CollegeStudent collegeStudent3 = new CollegeStudent("JJJ",crArrays,"II", 12, 1);

    SpecialStudent specialStudent = new SpecialStudent("Kolasko",crArrays,"sjd@kjs", 2);
    SpecialStudent specialStudent1 = new SpecialStudent("Olha","Lovo",12,"FRI",12,1,"sdf",34);
    SpecialStudent specialStudent2 = new SpecialStudent("SDF","Sdf",23,"sdf@df",12);

    //Cat barsik = new Cat();
//public Course(int startDate, String name) {
    //    this.startDate = startDate;
    //   this.name = name;
    // }


    //public Course( String name, int hoursDuration, String teacherName) {
    //   this.name = name;
    //   this.hoursDuration = hoursDuration;
    //   this.teacherName = teacherName;
  }
}
//}
