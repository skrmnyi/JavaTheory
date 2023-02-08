package QA.Condition;

public class LongestWord {

    static void longestWordFinder(String firstWord, String secondWord, String thirdWord) {
        if (firstWord.length() > secondWord.length() && firstWord.length() > thirdWord.length()) {
            System.out.println("The " + firstWord + " is the longest word out of three");
        } else if (secondWord.length() > firstWord.length() && secondWord.length() > thirdWord.length()) {
            System.out.println("The " + secondWord + " is the longest word out of three");
        } else if (thirdWord.length() > firstWord.length() && thirdWord.length() > secondWord.length()) {
            System.out.println("The " + thirdWord + " is the longest word out of three");
        } else {
            System.out.println("All 3 words has the same length");
        }
    }

    public static void main(String[] args) {
        longestWordFinder("Short", "Middle", "Longest");
    }

}

