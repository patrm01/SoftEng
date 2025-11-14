import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Customer customer = new Customer("123456789012", 0.0, "Mikey", "Smith", 25);
        Controller controller = new Controller(customer);
        System.out.println("Available items in the store:");
        for (GroceryItem item : controller.getData()) {
            System.out.printf("ID: %d | Name: %s | Price: %.2f | Stock: %d%n",
                    item.getItemId(), item.getName(), item.getPrice(), item.getStock());
        }

        GroceryItem milk = controller.getData().get(0);
        GroceryItem eggs = controller.getData().get(1);

        controller.addToCart(milk);
        controller.addToCart(eggs);

        System.out.println("\nCustomer's cart:");
        for (GroceryItem item : controller.getCart()) {
            System.out.printf("%-10s %.2f%n", item.getName(), item.getPrice());

        }

        System.out.printf("Total: %.2f%n", customer.getBalance());
    }
}
