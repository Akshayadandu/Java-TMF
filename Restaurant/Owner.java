package Restaurant;
import java.util.HashMap;

public class Owner {

    HashMap<String, Integer> menu = new HashMap<>();

    Owner() {
        menu.put("dosa", 50);
        menu.put("idly", 40);
        menu.put("vada", 60);
        menu.put("poori", 70);
    }

    void displayMenu() {
        menu.forEach((k, v) ->
                System.out.println("Item: " + k + "   Price: " + v)
        );
    }
}