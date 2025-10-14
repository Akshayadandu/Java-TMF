package javaPractice;

		public class customer {
		    int id;
		    String customer_name;
		    int balance;

		    customer(int id, String customer_name, int Initial_amount) {
		        this.id = id;
		        this.customer_name = customer_name;
		        this.balance = Initial_amount;
		    }

		    void display() {
		        System.out.println("Customer ID: " + id); 
		        System.out.println("Name: " + customer_name);
		        System.out.println("Balance: " + balance);
		    }
		}
