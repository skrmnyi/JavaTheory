package QA.Inheritance;

public class Pet extends Animal {
  Pet() {
    System.out.println("I am pet");
    super.eyes = 2;
  }

  String name;
  int tail = 1;
  int paw = 4;

  void run() {
    System.out.println("Pet runs");
  }

  void jump() {
    System.out.println("Pet jumps");
  }
}
