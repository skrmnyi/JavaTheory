package QA.Arrays;

public class MinModuleDifference {
  public void calculateMin(int[] array) {
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < array.length; i++) {
      int a = array[i];
      for (int j = 0; j < array.length; j++) {
        int b = a - array[j];
        if (b > 0 && b % 2 == 0) {
          if (b < min) {
            min = b;
          }
        }
      }
    }
    System.out.println("The smallest difference value\n" + "and modulo number is " + min);
  }

  public static void main(String[] args) {
    MinModuleDifference test = new MinModuleDifference();
    test.calculateMin(new int[] {5, 11, 7, 20});
  }
}

