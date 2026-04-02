import java.util.HashMap;

public class Inventory {

    HashMap<String, Item> items = new HashMap<>();

    public void addItem(Item item) {
        items.put(item.getItemId(), item);
        System.out.println("Item added.");
    }

    public void removeItem(String id) {
        if (items.remove(id) != null)
            System.out.println("Item removed.");
        else
            System.out.println("Item not found.");
    }

    public void updateQuantity(String id, int qty) {
        Item item = items.get(id);
        if (item != null) {
            item.setQuantity(qty);
            System.out.println("Updated.");
        } else {
            System.out.println("Item not found.");
        }
    }

    public void searchById(String id) {
        Item item = items.get(id);
        if (item != null)
            System.out.println(item);
        else
            System.out.println("Item not found.");
    }

    public void displayAll() {
        for (Item item : items.values()) {
            System.out.println(item);
        }
    }
}