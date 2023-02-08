package QA.Constructors;
public class EmployeeData {
    static Employee junior = new Employee(250, "Potter", 1);
    static Employee middle = new Employee("Granger", 300, 2);
    static Employee senior = new Employee(3, "Snape", 400);
    public static void main(String[] args) {
        junior.showId();
        junior.showSalary();
        junior.showSurname();
        System.out.println("___________");
        middle.showId();
        middle.showSalary();
        middle.showSurname();
        System.out.println("___________");
        senior.showId();
        senior.showSalary();
        senior.showSurname();
    }
}
