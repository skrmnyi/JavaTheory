package QA.Inheritance;

public class Cat extends Pet {
  Cat(String name) {
    super.name = name;
    System.out.println("I am cat and my name is " + name);
  }

  void sleep() {
    System.out.println("Cat is sleeping");
  }
}
