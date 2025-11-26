package Restaurant;
import java.util.*;

public class Customer extends Owner {

    HashMap<String, Integer> order = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    Customer() {
     
    }

    void seeMenu() {
        super.displayMenu();
    }

    void placeOrder(String food, int quantity) {

        if (menu.containsKey(food)) {
            order.put(food, quantity);
            System.out.println("Ordered " + quantity + " of " + food);
        } else {
            System.out.println("Food item not available");
        }
    }

    void displayOrder() {
        order.forEach((k, v) ->
                System.out.println("Item: " + k + "   Quantity: " + v)
        );
    }

    void billing() {
        int amt = 0;

        for (String foodItem : order.keySet()) {
            amt = amt + menu.get(foodItem) * order.get(foodItem);
        }

        System.out.println("Total bill amount is: " + amt);
    }
}
