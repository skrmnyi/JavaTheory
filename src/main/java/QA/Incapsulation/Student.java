package QA.Incapsulation;

public class Student {
  private String name;
  private int course;
  private int grade;

  public Student() {
  }

  protected Student(String name, int course, int grade) {
    this.name = name;
    this.course = course;
    this.grade = grade;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name.length() >= 3) {
      this.name = name;
    }
  }

  public void setGrade(int grade) {
    if (grade >= 1 && grade <= 10) {
      this.grade = grade;
    } else {
      System.out.println("Grade int range should be 1 - 10");
    }
  }

  public int getGrade() {
    return grade;
  }

  public int getCourse() {
    return course;
  }

  public void setCourse(int course) {
    if (course >= 1 && course <= 4) this.course = course;
  }

  public void showInfo() {
    System.out.println(getName());
    System.out.println(getCourse());
    System.out.println(getGrade());
  }
}


