public class GroceryCart {
	private ArrayList<GroceryItem> cart;

	public GroceryCart(){
		cart = new ArrayList<GroceryItem>();
	}

    public ArrayList<GroceryItem> getCart() {
        return cart;
    }

    public void addToCart(GroceryItem add) {
        cart.add(add);
        this.calculateTotal();
    }

    public void removeFromCart(GroceryItem remove) {
        cart.remove(remove);
        this.calculateTotal();
    }
}