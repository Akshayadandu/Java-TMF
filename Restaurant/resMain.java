package Restaurant;

import java.util.Scanner;

public class resMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Customer c = new Customer();

        
        c.seeMenu();

        System.out.println("How many items do you want to order?");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.println("Enter food name:");
            String food = sc.nextLine();

            System.out.println("Enter quantity:");
            int qty = sc.nextInt();
            sc.nextLine(); 

            c.placeOrder(food, qty);
        }

        System.out.println("\nYour Orders:");
        c.displayOrder();

        System.out.println("\nBilling:");
        c.billing();

        sc.close();
    }
}
