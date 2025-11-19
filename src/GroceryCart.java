public class GroceryCart {
	private ArrayList<GroceryItem> cart;
	private double subTotal;
	private final double taxRate = 0.07; 

	public GroceryCart(){
		cart = new ArrayList<GroceryItem>();
	}

    public ArrayList<GroceryItem> getCart() {
        return cart.clone();
    }

    public void addToCart(GroceryItem add) {
        cart.add(add);
        this.calculateTotal();
    }

    public void removeFromCart(GroceryItem remove) {
        cart.remove(remove);
        this.calculateTotal();
    }

    public void clearCart() {
    	cart.clear();
    }	

    public void calculateSubtotal(){
    	for(GroceryItem item : cart) {
    		this.subTotal += item.getPrice();
    	}
    }

    public double getSubtotal() {
    	return this.subTotal;
    }

    public double calculateTotalWithTax() {
    	return ((this.subTotal * taxRate) + this.subTotal)
    }
}