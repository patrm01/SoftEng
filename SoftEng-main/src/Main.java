import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("123456789012", 100.0, "John", "Doe", 30);
        Controller controller = new Controller(customer);
        controller.getDatabase().addNewItem("orange juice", 50, 4.00, 3);
        ArrayList<GroceryItem> allItems = controller.getData();
        for (GroceryItem item : allItems) {
            System.out.println(item);
        }
        customer.setBudget(7.62);
        customer.getCart().addToCart(allItems.get(0));
        customer.getCart().addToCart(allItems.get(1));
        System.out.println("this is cart");
        customer.getCart().clearCart();
        System.out.println("this is cart 2");
        System.out.println(customer.getCart());
        controller.checkOut();

        }
}