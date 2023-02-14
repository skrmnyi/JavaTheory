package QA.Exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {
  void devider(int numbers[], int deviderValue) {
    int devidedResults[] = new int[numbers.length];
    try {
      for (int i = 0; i < numbers.length; i++) {
        int result = numbers[i] / deviderValue;
        devidedResults[i] = result;
      }
      System.out.println(Arrays.toString(devidedResults));
    } catch (ArithmeticException exception) {
      System.out.println("Back to school and learn math");
    }
  }

  public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    Exception test = new Exception();
    try {
      int deviderValue = userInput.nextInt();
      test.devider(new int[] {10, 8, 4, -1, 999, -200, 0}, deviderValue);
    } catch (InputMismatchException exception) {
      System.out.println("Input value wasn't provided or was provided in wrong format");
    }
  }
}
