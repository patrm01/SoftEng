import java.util.ArrayList;

public class Controller {

    private Database database;
    private Customer customer;

    public Controller(Customer customer) {
        this.database = new Database();
        this.customer = customer;
    }

    public ArrayList<GroceryItem> getData() {
        return database.getStoreList();
    }

    // Just placeholder, will use to send data somewhere
    public void sendDatabase() {
        System.out.println("Database sent to interface.");
    }

    // Just placeholder, will use to validate customer or input
    public boolean validateData() {
        return customer.getCustomerAge() <= 0 || customer.getPaymentInfo() != null && customer.getPaymentInfo().length() == 12;
    }

    // Just placeholder, will use to send something to interface
    public void sendInterface() {
        System.out.println("Interface updated.");
    }

    public ArrayList<GroceryItem> filterItems(ArrayList<String> filters) {
        if (filters == null || filters.isEmpty()) {
            return database.getStoreList();
        }
        return database.getFilteredList(filters);
    }

    public GroceryCart getCart() {
        return customer.getCart();
    }

    public void addToCart(GroceryItem item) {
        customer.addToCart(item);
    }

    public void removeFromCart(GroceryItem item) {
        customer.removeFromCart(item);
    }

    public Database getDatabase() {
        return database;
    }

    public void checkOut() {
        double totalCost = customer.getCart().calculateTotalWithTax();

        if (totalCost > customer.getBudget()) {
            System.out.println("Insufficient funds to complete the purchase.");
        } else if (!validateData()) {
            System.out.println("Invalid data.");
        } else {
            customer.setBudget(customer.getBudget() - totalCost);
            System.out.printf("Purchase successful! Remaining budget: %.2f%n", customer.getBudget());
            customer.writeReceiptToFile("receipt.txt");
            customer.getCart().clearCart();
        }
    }

}
