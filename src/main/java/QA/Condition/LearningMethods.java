package QA.Condition;

import java.util.Scanner;

public class LearningMethods {
  static void doSmthWithInput(int input) {
    System.out.println("The sum of each number for " + input + " is: " +
        ((input % 10) + ((input / 10) % 10) + ((input / 100) % 10)));
  }

  static void doSmthWithInput(String firstParameter, String secondParameter) {
    String concatStrings = firstParameter + secondParameter;
    System.out.println("The sum of characters for provided 2 words: " + concatStrings.length());
  }

  static void doSmthWithInput() {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Please provide the number: ");
    int number = userInput.nextInt();
    if (number > 0) {
      System.out.println("Your number is bigger than - 0");
    } else if (number == 0) {
      System.out.println("Your number is - 0 ");
    } else {
      System.out.println("Your number is less than - 0 ");
    }
  }

  public static void main(String[] args) {
    doSmthWithInput(555);
    doSmthWithInput("4symb", "5sym");
    doSmthWithInput();
  }
}