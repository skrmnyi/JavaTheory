package QA.Constructors;

public class StudentTest {
  public static void main(String[] args) {
    Student studentA = new Student("studentA", 5.5, 2, 4.5);
    Student studentB = new Student("studentB", 7, 7, 4);
    Student studentC = new Student("studentC", 2, 2, 2);
    studentA.avgMarkAllSubjects();
    studentB.avgMarkAllSubjects();
    studentC.avgMarkAllSubjects();
  }
}
