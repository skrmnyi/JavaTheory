package QA.Loops;

public class NestedLoops {
  public static void main(String[] args) {

    for (int i = 1; i <=2 ; i++) {
      System.out.println("Run of first cycle- " + i);  //first cycle starts here and then all 6 times cycle from 2nd
      for (int j = 1; j <= 6; j++) {                   // for. only when all.
        System.out.println("Run of second cycle - " +j);

      }


    }
  }



}
