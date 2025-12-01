import java.util.ArrayList;

public class GroceryCart {
	private ArrayList<GroceryItem> cart;
	private double subTotal;
	private final double taxRate = 0.07; 

	public GroceryCart(){
		cart = new ArrayList<GroceryItem>();
	}

    public ArrayList<GroceryItem> getCart() {
        return (ArrayList<GroceryItem>) cart.clone();
    }

    public void addToCart(GroceryItem add) {
        cart.add(add);
        this.calculateSubtotal();
    }

    public void removeFromCart(GroceryItem remove) {
        cart.remove(remove);
        this.calculateSubtotal();
    }

    public void clearCart() {
        cart.clear();
        this.calculateSubtotal();
    }

    public void calculateSubtotal(){
    	this.subTotal = 0;
        for(GroceryItem item : cart) {
    		this.subTotal += item.getPrice();
    	}
    }

    public double getSubtotal() {
    	return this.subTotal;
    }

    public double calculateTotalWithTax() {
    	return ((this.subTotal * taxRate) + this.subTotal);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(GroceryItem item : cart) {
            sb.append(item.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}
