package QA.Streams;

import java.util.List;
import java.util.stream.Collectors;

public class Items {
  private String color;
  private int price;
  private String itemCategory;

  public Items(String color, int price, String itemCategory) {
    this.color = color;
    this.price = price;
    this.itemCategory = itemCategory;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public String getItemCategory() {
    return itemCategory;
  }

  public void setItemCategory(String itemCategory) {
    this.itemCategory = itemCategory;
  }

  @Override
  public String toString() {   // for changing link address to text
    return "Items{" + "color='" + color + '\'' + ", price=" + price + ", itemCategory='" +
        itemCategory + '\'' + '}';
  }

  public static void main(String[] args) {
    Items item1 = new Items("Red", 200, "Smartphone");
    Items item2 = new Items("Grey", 200, "Smartphone");
    Items item3 = new Items("Blue", 300, "Smartphone");
    Items item4 = new Items("White", 400, "Laptop");
    Items item5 = new Items("Black", 550, "Laptop");
    Items item6 = new Items("Yellow", 100, "Headphones");
    Items item7 = new Items("Grey", 100, "Headphones");
    List<Items> items = List.of(item1, item2, item3, item4, item5, item6, item7);
    List<Items> smartphoneItems =
        items.stream().filter(itemType -> itemType.getItemCategory() == "Smartphone")
            .collect(Collectors.toList());
    System.out.println(smartphoneItems); // sorted smartphones
    System.out.println(items); // not sorted - all items
    List<Items> specificColor = items.stream()
        .filter(itemColor -> itemColor.getColor() == "Red" || itemColor.getColor() == "Grey")
        .collect(Collectors.toList());
    System.out.println(specificColor); // sorted for colors parameters
    List<Items> specificPrice =
        items.stream().filter(itemPrice -> itemPrice.getPrice() > 200 && itemPrice.getPrice() < 400)
            .collect(Collectors.toList());
    System.out.println(specificPrice); // sorted for price parameters
  }
}


