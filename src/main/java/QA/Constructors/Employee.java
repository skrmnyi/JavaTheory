package QA.Constructors;

public class Employee {
  private double salary;
  public String surname;
  protected int id;

  public void showSalary() {
    System.out.println(salary);
  }

  public void showSurname() {
    System.out.println(surname);
  }

  public void showId() {
    System.out.println(id);
  }

  public Employee(double salary, String surname, int id) {
    this.salary = salary;
    this.surname = surname;
    this.id = id;
  }

  Employee(String surname, double salary, int id) {
    this.salary = salary;
    this.surname = surname;
    this.id = id;
  }

  private Employee(int id, String surname, double salary) {
    this.salary = salary;
    this.surname = surname;
    this.id = id;
  }
}
