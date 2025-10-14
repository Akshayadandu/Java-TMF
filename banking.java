
import java.util.Scanner;

public class Banking {

    void deposit(Customer c, int amount) {
        c.balance += amount;
        System.out.println("Amount deposited successfully!");
        System.out.println("Updated Balance: " + c.balance);
    }

    void withdraw(Customer c, int amount) {
        if (amount > c.balance) {
            System.out.println("Insufficient balance!");
        } else {
            c.balance -= amount;
            System.out.println("Amount withdrawn successfully!");
            System.out.println("Updated Balance: " + c.balance);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the initial amount: ");
        int initial = sc.nextInt();

        Customer c1 = new Customer(id, name, initial);
        Banking bank = new Banking();

        System.out.println("Enter amount to deposit: ");
        int depositAmount = sc.nextInt();
        bank.deposit(c1, depositAmount);

        System.out.println("Enter amount to withdraw: ");
        int withdrawAmount = sc.nextInt();
        bank.withdraw(c1, withdrawAmount);

        System.out.println("\nFinal details:");
        c1.display();
    }
}