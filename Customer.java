import java.util.ArrayList;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Customer {
    private String paymentInfo;
    private int balance;
    private String firstName, lastName;
    private int customerAge;
	private ArrayList<GroceryItem> cart;

	public Customer(String paymentInfo, int balance, String firstName, String lastName, int customerAge) {
		this.paymentInfo = paymentInfo;
		this.balance = balance;
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerAge = customerAge;
		cart = new ArrayList<>();
	}

    //defining boilerplate getters and setters
    public int getBalance() {
        return balance;
    }

    public void setBalance(int newBalance) {
        balance = newBalance;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
    }
		if(paymentInfo.length()==12)

    {
        this.paymentInfo = paymentInfo;
    }
		else(System.out.println("Invalid info, please enter 12 digits in quotes."));

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public void setCustomerAge(int age) {
        if (customerAge > 0) {
            this.customerAge = customerAge;
        } else {
            System.out.println("Customer Age is invalid.");
        }
    }

	public void calculateTotal() {
		this.balance = 0;
        for(GroceryItem item: cart) {
			balance += item.getPrice();
		}
    }

    public void addToCart(GroceryItem add){
        cart.add(add);
        this.calculateTotal(cart);
    }
    public void removeFromCart(GroceryItem remove){
        cart.remove(remove);
        this.calculateTotal(cart);
    }

    public void writeReceiptToFile(String filename) {
        try(PrintWriter out = new PrinterWriter(new FileWriter(filename))) {
            out.printf("%-20s %8s 510s%n", "Item", "Qty", "Price");

            for(GroceryItem item : cart) {
                String itemName = item.getName();
                double price = item.getPrice();
                int quantity = 1;

                out.printf("%-20s %8d %10.2f%n", itemName, quantity, price);
            }
            out.println();
            out.printf("Customer: %s %s%n", firstName, lastName);
            out.printf("Amount paid: %.2f%n", balance);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
