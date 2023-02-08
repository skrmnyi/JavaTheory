package QA.Inheritance;

public class Dog extends Pet {

  Dog (String name) {
    super.name = name;
    System.out.println("I am dog and my name is " + name);
  }
  void play () {
    System.out.println("Dog plays");
  }
}
