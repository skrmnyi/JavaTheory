package QA.Incapsulation;

public class TestStudent {
  public static void main(String[] args) {

    Student newbie = new Student("Ronald", 1, 2);
    newbie.showInfo();


    Student pro = new Student();
    pro.setName("Hermione");
    pro.setGrade(10);
    pro.setCourse(4);

    pro.showInfo();
  }
}

