package QA.Constructors;
public class Student {
    int studentCardId;
    String lastName;
    String name;
    String course;
    double mathAvgMark;
    double economicAvgMark;
    double foreignLangAvgMark;
    public Student(String lastName, double mathAvgMark, double economicAvgMark, double foreignLangAvgMark) {
        this.lastName = lastName;
        this.mathAvgMark = mathAvgMark;
        this.economicAvgMark = economicAvgMark;
        this.foreignLangAvgMark = foreignLangAvgMark;
    }
    void avgMarkAllSubjects() {
        double result = (mathAvgMark + economicAvgMark + foreignLangAvgMark) / 3;
        System.out.println("The average mark for all 3 subjects for " + lastName + " is " + result);
    }
}
