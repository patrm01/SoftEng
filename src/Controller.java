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
        if (customer.getCustomerAge() <= 0) return false;
        if (customer.getPaymentInfo.getPaymentInfo() == null || customer.getPaymentInfo.getPaymentInfo().length() != 12) return false;
        return true;
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

    public ArrayList<GroceryItem> getCart() {
        return customer.getCart();
    }

    public void addToCart(GroceryItem item) {
        customer.addToCart(item);
    }

    public void removeFromCart(GroceryItem item) {
        customer.removeFromCart(item);
    }
}
