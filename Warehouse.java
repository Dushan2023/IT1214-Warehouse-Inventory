import java.util.Scanner;

public class Warehouse {

    Inventory inventory = new Inventory();
    Scanner sc = new Scanner(System.in);

    public void start() {
        int choice;

        do {
            System.out.println("\n1.Add 2.Remove 3.Update 4.Search 5.Display 6.Exit");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    remove();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    inventory.displayAll();
                    break;
            }

        } while (choice != 6);
    }

    void add() {
        System.out.print("ID: ");
        String id = sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Qty: ");
        int qty = sc.nextInt();

        System.out.print("Price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        inventory.addItem(new Item(id, name, qty, price));
    }

    void remove() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        inventory.removeItem(id);
    }

    void update() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();

        System.out.print("New Qty: ");
        int qty = sc.nextInt();
        sc.nextLine();

        inventory.updateQuantity(id, qty);
    }

    void search() {
        System.out.print("Enter ID: ");
        String id = sc.nextLine();
        inventory.searchById(id);
    }
}