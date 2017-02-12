package Module3.Solution;

/**
 * Created by Owner on 1/25/2017.
 */
public class SolutionMain {
  public static void main(String[] args) {
    Course[] crArrays = new Course[3];
    crArrays[0] = new Course("math", 3, "Ivanko");
    crArrays[1] = new Course("English", 5, "Nicolau");


    Course course = new Course("Match", 12, "Tom");
    Course course1 = new Course(12, "Bob");

    Student student = new Student("Smith", "Logan", 3);
    Student student1 = new Student("GGG", crArrays);

    CollegeStudent collegeStudent = new CollegeStudent("Anna", "Kovalenko", 4);
    CollegeStudent collegeStudent1 = new CollegeStudent("Helena", "Kdanska", 12, "MUI", 1, 2);
    CollegeStudent collegeStudent2 = new CollegeStudent("Kolesnik", "French", 20);


    SpecialStudent specialStudent = new SpecialStudent("Kolasko", "DD", 2);
    SpecialStudent specialStudent1 = new SpecialStudent("Olha", crArrays);
    SpecialStudent specialStudent2 = new SpecialStudent(12, "SDF", "FF", 2);
  }
}


