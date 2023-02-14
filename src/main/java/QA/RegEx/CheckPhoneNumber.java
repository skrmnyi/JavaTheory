package QA.RegEx;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckPhoneNumber {
  Scanner userInput = new Scanner(System.in);

  void phoneChecker() {
    System.out.println("Please provide your phone number in the\n" +
        "strictly same format +380-99-1234567");
    String phoneNumber = userInput.nextLine();

    String regex = "[+](380)-[0-9]{2}-[0-9]{7}$";
    Pattern phonePattern = Pattern.compile(regex);
    Matcher matcher = phonePattern.matcher(phoneNumber);

    String messageOutput = (matcher.matches()) ? "Great, your phone number valid" :
        "Failed, provided phone number format is not valid";
    System.out.println(messageOutput);
  }

  public static void main(String[] args) {
    CheckPhoneNumber test = new CheckPhoneNumber();
    test.phoneChecker();
  }
}



