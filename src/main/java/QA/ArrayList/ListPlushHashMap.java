package QA.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListPlushHashMap {
  public static void main(String[] args) {
    List<String> books = new ArrayList<>();
    books.addAll(Arrays.asList("Book1", "Book2", "Book3", "Book4", "Book5"));
    HashMap<Integer, String> books2 = new HashMap<>();
    for (int i = 0; i < books.size(); i++) {
      books2.put(i, books.get(i));
    }
    System.out.println("Key of HashMap equals to index of List\n" + books2);
  }
}
